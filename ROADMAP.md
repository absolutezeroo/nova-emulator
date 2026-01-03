# NovaEmulator - Technical Implementation Roadmap

> **From Static Shell to Walking Skeleton**
> Version: 1.0 | Date: January 2026
> Architecture: Hexagonal (Ports & Adapters) | Java 21 | Guice DI

---

## Table of Contents

1. [Project State Assessment](#project-state-assessment)
2. [Phase 1: Wiring & Authentication](#phase-1-wiring--authentication)
3. [Phase 2: Concurrency Model](#phase-2-concurrency-model)
4. [Phase 3: Room Engine](#phase-3-room-engine)
5. [Phase 4: Entity Movement (ECS)](#phase-4-entity-movement-ecs)
6. [Legacy Reference Files](#legacy-reference-files)
7. [Database Schema](#database-schema)

---

## Project State Assessment

### Current Status

| Component                   | Status           | Count/Details                   |
|-----------------------------|------------------|---------------------------------|
| Hexagonal Structure         | ✅ Complete       | nova-core, nova-infra, nova-app |
| TCP Server (Flash/Air)      | ✅ Complete       | Port 30000                      |
| WebSocket Server (Nitro)    | ✅ Complete       | Port 2096                       |
| Incoming Events (DTOs)      | ✅ Complete       | **457 files**                   |
| Outgoing Messages (DTOs)    | ✅ Complete       | **447 files**                   |
| Parsers (auto-registered)   | ✅ Complete       | **~457 parsers**                |
| Composers (auto-registered) | ✅ Complete       | **~447 composers**              |
| Handlers (business logic)   | ⚠️ **3 of ~50+** | Handshake complete              |
| Database Adapters           | ✅ Complete       | Jdbi 3 + normalized schema      |
| Room Engine                 | ❌ Missing        | No RoomRepository               |
| Concurrency Model           | ❌ Missing        | No StripedRoomTaskScheduler     |
| Pathfinding                 | ❌ Missing        | No A* implementation            |

### Packet Categories Available

```
incoming/
├── achievement/    ├── group/        ├── navigator/    ├── talent/
├── catalog/        ├── guide/        ├── pet/          ├── trading/
├── competition/    ├── handshake/    ├── poll/         ├── unit/
├── crafting/       ├── marketplace/  ├── recycler/     ├── user/
├── furniture/      ├── messenger/    ├── room/         ├── wired/
└── moderation/     └── misc/
```

---

## Phase 1: Wiring & Authentication

**Goal:** Client connects → SSO ticket → Hotel View loads

### 1.1 Unified Annotation-Based Auto-Registration (IMPLEMENTED)

**Previous Problem:**
- `PacketRegistry.java` was a massive auto-generated file (~62k tokens)
- Manual registration for each parser/composer/handler
- Difficult to maintain, error-prone

**Solution:** Unified annotation-based classpath scanning using ClassGraph

#### Annotations Created

| Annotation                    | Target    | Purpose                       |
|-------------------------------|-----------|-------------------------------|
| `@ParsesPacket(Incoming.*)`   | Parsers   | Marks parser with header ID   |
| `@ComposesPacket(Outgoing.*)` | Composers | Marks composer with header ID |
| `@HandlesPacket(Event.class)` | Handlers  | Marks handler with event type |

**Location:** `nova-infra/.../packets/annotations/`

#### Implementation Files

| File                  | Location       | Status    |
|-----------------------|----------------|-----------|
| `ParsesPacket.java`   | `annotations/` | ✅ Created |
| `ComposesPacket.java` | `annotations/` | ✅ Created |
| `HandlesPacket.java`  | `annotations/` | ✅ Created |
| `PacketScanner.java`  | `annotations/` | ✅ Created |

#### Usage Examples

**Parser (before → after):**
```java
// BEFORE: Manual getHeaderId()
public class SSOTicketParser extends PacketParser<SSOTicketMessageEvent> {
    @Override
    public int getHeaderId() {
        return Incoming.SECURITY_TICKET;
    }
}

// AFTER: Annotation-based
@ParsesPacket(Incoming.SECURITY_TICKET)
public class SSOTicketParser extends PacketParser<SSOTicketMessageEvent> {
    // getHeaderId() no longer needed - read from annotation
}
```

**Composer (before → after):**
```java
// BEFORE: Manual getPacketId()
public class AuthenticatedComposer extends PacketComposer<AuthenticatedMessage> {
    @Override
    public int getPacketId() {
        return Outgoing.AUTHENTICATED;
    }
}

// AFTER: Annotation-based
@ComposesPacket(Outgoing.AUTHENTICATED)
public class AuthenticatedComposer extends PacketComposer<AuthenticatedMessage> {
    // getPacketId() no longer needed - read from annotation
}
```

**Handler:**
```java
@HandlesPacket(SSOTicketMessageEvent.class)
public class SsoTicketHandler implements PacketHandler<SSOTicketMessageEvent> {
    @Inject
    public SsoTicketHandler(UserUseCase userUseCase, PacketComposerManager composer) {
        // Dependencies injected via Guice
    }
}
```

#### PacketScanner

Unified scanner using ClassGraph that discovers and registers all packet components:

```java
// nova-infra/adapter/in/network/packets/annotations/PacketScanner.java
public class PacketScanner {
    private static final String BASE_PACKAGE = "com.nova.infra.adapter.in.network.packets";

    public static int registerParsers(PacketParserManager manager) {...}
    public static int registerComposers(PacketComposerManager manager) {...}
    public static int registerHandlers(PacketHandlerManager manager, Injector injector) {...}
    public static void registerAll(ParserManager, ComposerManager, HandlerManager, Injector) {...}
}
```

#### InfrastructureModule Integration

```java
@Provides @Singleton
public PacketParserManager provideParserManager() {
    PacketParserManager manager = new PacketParserManager();
    PacketScanner.registerParsers(manager);  // Auto-discovers ~457 parsers
    return manager;
}

@Provides @Singleton
public PacketComposerManager provideComposerManager() {
    PacketComposerManager manager = new PacketComposerManager();
    PacketScanner.registerComposers(manager);  // Auto-discovers ~447 composers
    return manager;
}

@Provides @Singleton
public PacketHandlerManager provideHandlerManager(Injector injector) {
    PacketHandlerManager manager = new PacketHandlerManager();
    PacketScanner.registerHandlers(manager, injector);  // Auto-discovers handlers with DI
    return manager;
}
```

#### Dependencies (pom.xml)

```xml
<!-- Parent pom.xml - dependency management -->
<dependencyManagement>
    <dependencies>
        <dependency>
            <groupId>io.github.classgraph</groupId>
            <artifactId>classgraph</artifactId>
            <version>4.8.177</version>
        </dependency>
    </dependencies>
</dependencyManagement>

<!-- nova-infra/pom.xml -->
<dependency>
    <groupId>io.github.classgraph</groupId>
    <artifactId>classgraph</artifactId>
</dependency>
```

#### Migration Path

Parsers and composers have backwards compatibility via `getHeaderIdLegacy()` / `getPacketIdLegacy()` fallback methods. Migration can be done incrementally:

1. Add annotation to class
2. Remove the manual `getHeaderId()` / `getPacketId()` override
3. Test

The `PacketRegistry.java` file can be deleted once all parsers/composers are migrated.

### 1.2 Complete Authentication Flow (IMPLEMENTED)

**Handshake Handlers (3/3):**
| Handler              | Packet ID | Purpose                          |
|----------------------|-----------|----------------------------------|
| `ClientHelloHandler` | 4000      | Initial client connection        |
| `SsoTicketHandler`   | 2419      | SSO authentication + user load   |
| `UniqueIDHandler`    | 2490      | Machine ID tracking              |

**`SsoTicketHandler` Response Packets:**
- ✅ AuthenticatedMessage (server confirms auth)
- ✅ UserInfoMessage (user profile data)
- ✅ UserCreditsMessage (currency balance)

**`UniqueIDHandler` Response:**
- ✅ UniqueMachineIDMessage (server-generated machine ID)

**WebSocket Support:**
- ✅ `WebSocketBinaryEncoder` - Wraps ByteBuf in BinaryWebSocketFrame for Nitro client

**Missing Packets for Full Hotel View:**

| #  | Message Class               | Header              | Purpose             |
|----|-----------------------------|---------------------|---------------------|
| 1  | `UserHomeRoomMessage`       | USER_HOME_ROOM      | Home room ID        |
| 2  | `AvailabilityStatusMessage` | AVAILABILITY_STATUS | Server status       |
| 3  | `UserPermissionsMessage`    | USER_PERMISSIONS    | Rank/permissions    |
| 4  | `UserEffectsListMessage`    | USER_EFFECTS        | Effect inventory    |
| 5  | `UserClothesMessage`        | USER_CLOTHES        | Saved outfits       |
| 6  | `NavigatorSettingsMessage`  | NAVIGATOR_SETTINGS  | Nav categories      |
| 7  | `FavoriteRoomsCountMessage` | FAVORITE_ROOMS      | Favorites count     |
| 8  | `MessengerInitMessage`      | MESSENGER_INIT      | Friends list config |
| 9  | `FriendListFragmentMessage` | FRIEND_LIST         | Friends data        |
| 10 | `UserClubMessage`           | USER_SUBSCRIPTION   | HC status           |

### 1.3 Database Layer (IMPLEMENTED)

**Status:** ✅ Complete - Using Jdbi 3 with normalized schema

**Schema:** `database/schema.sql` - Fully normalized with foreign key relationships

**Normalized Tables:**
| Table              | Purpose                                    |
|--------------------|--------------------------------------------|
| `users`            | Core identity (id, username, email, rank)  |
| `user_data`        | Profile data (motto, figure, online status)|
| `user_tickets`     | SSO authentication tokens (single-use)     |
| `user_currencies`  | Flexible multi-currency (credits, pixels)  |
| `user_settings`    | User preferences                           |
| `ranks`            | Rank definitions                           |
| `permissions`      | Available permissions                      |
| `rank_permissions` | Many-to-many rank ↔ permission             |

**Jdbi DAOs:**
```java
// UserDao - Core identity queries
@SqlQuery("SELECT ... FROM users WHERE id = :id")
Optional<UserEntity> findById(@Bind("id") int id);

// UserDataDao - Profile operations
@SqlUpdate("UPDATE user_data SET motto = :motto, figure = :figure WHERE user_id = :userId")
int updateProfile(@Bind("userId") int userId, ...);

// UserTicketDao - SSO validation
@SqlQuery("SELECT ... FROM user_tickets WHERE ticket = :ticket AND is_used = FALSE")
Optional<UserTicketEntity> findValidTicket(@Bind("ticket") String ticket);

// UserCurrencyDao - Multi-currency
@SqlUpdate("INSERT INTO user_currencies ... ON DUPLICATE KEY UPDATE amount = amount + :amount")
int addCurrency(@Bind("userId") int userId, @Bind("type") int type, @Bind("amount") int amount);
```

**JdbiUserRepository Flow:**
```
findBySsoTicket(ticket)
    ├── UserTicketDao.findValidTicket()  → validates SSO
    ├── UserDao.findById()               → loads identity
    ├── UserDataDao.findByUserId()       → loads profile
    └── UserCurrencyDao.getCredits()     → loads currencies
    → Returns combined User domain model
```

### 1.4 Port (Input) & Adapter (Output) Summary

| Input Port (nova-core)          | Output Adapter (nova-infra)              |
|---------------------------------|------------------------------------------|
| `UserUseCase.authenticate()`    | `JdbiUserRepository.findBySsoTicket()`   |
| `UserUseCase.getUserInfo()`     | `JdbiUserRepository.findById()`          |
| —                               | `UserDataDao.updateLoginInfo()`          |
| `SessionRepository.addOnline()` | `InMemorySessionRepository`              |

---

## Phase 2: Concurrency Model

**Goal:** Thread-safe room operations with parallel execution across rooms

### 2.1 The Problem

```
EventLoop-1 (Alice)              EventLoop-2 (Bob)
      │                                │
      ▼                                ▼
moveItem(room=42, item=100)      moveItem(room=42, item=100)
      │                                │
      └────────── RACE CONDITION ──────┘
                       │
              Room state corrupted
```

### 2.2 Solution: Striped Executor Pattern

```
                    ┌──────────────────────────────────────┐
                    │       StripedRoomTaskScheduler       │
                    │                                      │
                    │   ExecutorService[0]  (roomId % 4 = 0) │
                    │   ExecutorService[1]  (roomId % 4 = 1) │
                    │   ExecutorService[2]  (roomId % 4 = 2) │
                    │   ExecutorService[3]  (roomId % 4 = 3) │
                    └──────────────────────────────────────┘
```

**Guarantee:** Tasks for same `roomId` always execute on same stripe = sequential execution

### 2.3 Implementation

**Input Port (nova-core):**
```java
// nova-core/domain/port/in/RoomTaskScheduler.java
public interface RoomTaskScheduler {
    void execute(int roomId, Runnable task);
    <T> CompletableFuture<T> submit(int roomId, Supplier<T> task);
    void shutdown();
}
```

**Output Adapter (nova-infra):**
```java
// nova-infra/adapter/in/concurrency/StripedRoomTaskScheduler.java
public class StripedRoomTaskScheduler implements RoomTaskScheduler {

    private final ExecutorService[] stripes;

    public StripedRoomTaskScheduler(int stripeCount) {
        this.stripes = new ExecutorService[stripeCount];
        for (int i = 0; i < stripeCount; i++) {
            final int stripeId = i;
            stripes[i] = Executors.newSingleThreadExecutor(r ->
                new Thread(r, "RoomStripe-" + stripeId));
        }
    }

    @Override
    public void execute(int roomId, Runnable task) {
        int stripe = Math.floorMod(roomId, stripes.length);
        stripes[stripe].execute(task);
    }

    @Override
    public <T> CompletableFuture<T> submit(int roomId, Supplier<T> task) {
        int stripe = Math.floorMod(roomId, stripes.length);
        return CompletableFuture.supplyAsync(task, stripes[stripe]);
    }

    @Override
    public void shutdown() {
        for (ExecutorService stripe : stripes) {
            stripe.shutdown();
        }
    }
}
```

**Guice Binding:**
```java
// InfrastructureModule.java
@Provides @Singleton
public RoomTaskScheduler provideRoomTaskScheduler() {
    int cores = Runtime.getRuntime().availableProcessors();
    return new StripedRoomTaskScheduler(cores);
}
```

### 2.4 Handler Usage Pattern

**Without Scheduler (stateless operations):**
```java
@HandlesPacket(GetNavigatorCategoriesMessageEvent.class)
public class GetNavigatorCategoriesHandler implements PacketHandler<...> {
    @Override
    public void handle(NetworkConnection conn, GetNavigatorCategoriesMessageEvent event) {
        // Direct execution - no shared state
        List<Category> categories = navigatorUseCase.getCategories();
        conn.send(composerManager.compose(new NavigatorCategoriesMessage(categories)));
    }
}
```

**With Scheduler (room operations):**
```java
@HandlesPacket(MoveAvatarMessageEvent.class)
public class MoveAvatarHandler implements PacketHandler<MoveAvatarMessageEvent> {

    private final RoomTaskScheduler scheduler;
    private final RoomUseCase roomUseCase;

    @Override
    public void handle(NetworkConnection conn, MoveAvatarMessageEvent event) {
        User user = conn.getAttribute("user");
        int roomId = user.getCurrentRoomId();

        // Non-blocking - returns immediately to Netty
        scheduler.execute(roomId, () -> {
            // Executes on room's dedicated stripe thread
            roomUseCase.requestMovement(roomId, user.getId(), event.x(), event.y());
        });
    }
}
```

### 2.5 Handler Classification

**Direct Execution (no scheduler):**
- Authentication handlers
- Catalog browsing
- Navigator browsing
- User profile viewing
- Messenger operations

**Scheduler Required:**
- Room furniture operations (move, rotate, pickup, place)
- Room user actions (walk, sit, dance, chat)
- Trading operations
- Game operations (Wired, Battle Banzai, Freeze)
- Room settings changes

---

## Phase 3: Room Engine

**Goal:** Enter a room and see the model (tiles, heightmap, furniture)

### 3.1 Domain Model (nova-core)

```
nova-core/domain/model/room/
├── Room.java              # Aggregate root
├── RoomId.java            # Value object (record)
├── RoomLayout.java        # Heightmap + door + tile grid
├── RoomTile.java          # Individual tile (x, y, z, state)
├── RoomTileState.java     # Enum: OPEN, BLOCKED, INVALID, SIT, LAY
├── RoomSettings.java      # Name, description, max users, trade mode, etc.
└── RoomState.java         # Enum: OPEN, LOCKED, PASSWORD, INVISIBLE
```

### 3.2 Ports Definition

**Input Port:**
```java
// nova-core/domain/port/in/RoomUseCase.java
public interface RoomUseCase {
    Optional<RoomData> loadRoom(int roomId);
    EnterRoomResult enterRoom(UserId userId, int roomId, String password);
    void leaveRoom(UserId userId, int roomId);
    List<RoomSummary> getPublicRooms();
    List<RoomSummary> getUserRooms(UserId ownerId);
}
```

**Output Port:**
```java
// nova-core/domain/port/out/RoomRepository.java
public interface RoomRepository {
    Optional<Room> findById(int roomId);
    Optional<RoomLayout> findLayoutByName(String layoutName);
    Optional<RoomLayout> findCustomLayout(int roomId);
    List<Room> findByOwnerId(int ownerId);
    List<Room> findPublicRooms();
    Room save(Room room);
}
```

### 3.3 Heightmap Parsing

**Legacy Algorithm (from `RoomLayout.java:104-159`):**

```java
// Port this logic to nova-core/domain/model/room/RoomLayout.java
public void parseHeightmap(String heightmap) {
    String[] rows = heightmap.replace("\n", "").split("\r");
    this.sizeX = rows[0].length();
    this.sizeY = rows.length;
    this.tiles = new RoomTile[sizeX][sizeY];

    for (short y = 0; y < sizeY; y++) {
        for (short x = 0; x < sizeX; x++) {
            char c = Character.toLowerCase(rows[y].charAt(x));
            RoomTileState state = RoomTileState.OPEN;
            short height = 0;

            if (c == 'x') {
                state = RoomTileState.INVALID;
            } else if (Character.isDigit(c)) {
                height = (short) Character.getNumericValue(c);
            } else if (c >= 'a' && c <= 'z') {
                // a=10, b=11, ..., z=35
                height = (short) (10 + (c - 'a'));
            }

            tiles[x][y] = new RoomTile(x, y, height, state);
        }
    }

    this.doorTile = tiles[doorX][doorY];
}
```

**Example Heightmap:**
```
xxxxxxxxxxxx
x222222222xx
x222222222xx
x222222222xx
x222222222xx
x222222222xx
x222222222xx
x222222222xx
x222222222xx
x22222222xxx
x2222xxxxxxx
xxxxxxxxxxxx
```
- `x` = INVALID (void/wall)
- `0-9` = height 0-9
- `a-z` = height 10-35

### 3.4 Room Entry Packet Sequence

| Step | Incoming Event                   | Outgoing Messages                            |
|------|----------------------------------|----------------------------------------------|
| 1    | `OpenFlatConnectionMessageEvent` | `OpenConnectionMessage`                      |
| 2    | `GetRoomEntryDataMessageEvent`   | `RoomReadyMessage`, `RoomPropertyMessage`×4  |
| 3    | `GetHeightMapMessageEvent`       | `HeightMapMessage`, `HeightMapUpdateMessage` |
| 4    | `GetFloorItemsMessageEvent`      | `FurnitureFloorMessage`                      |
| 5    | `GetWallItemsMessageEvent`       | `FurnitureWallMessage`                       |
| 6    | `GetUsersMessageEvent`           | `UsersMessage`, `RoomUnitStatusMessage`      |

### 3.5 Database Adapter

```java
// nova-infra/adapter/out/persistence/dao/RoomDao.java
@RegisterConstructorMapper(RoomEntity.class)
public interface RoomDao {

    @SqlQuery("""
        SELECT r.id, r.owner_id AS ownerId, r.name, r.description,
               r.model_name AS modelName, r.state, r.score
        FROM rooms r
        WHERE r.id = :id
        """)
    Optional<RoomEntity> findById(@Bind("id") int id);

    @SqlQuery("SELECT * FROM room_models WHERE name = :name")
    @RegisterConstructorMapper(RoomModelEntity.class)
    Optional<RoomModelEntity> findModelByName(@Bind("name") String name);
}

// nova-infra/adapter/out/persistence/repository/JdbiRoomRepository.java
public class JdbiRoomRepository implements RoomRepository {

    private final Jdbi jdbi;
    private final Map<String, RoomLayout> layoutCache = new ConcurrentHashMap<>();

    @Override
    public Optional<Room> findById(int roomId) {
        return jdbi.withExtension(RoomDao.class, dao ->
            dao.findById(roomId).map(this::toDomainModel)
        );
    }
}
```

---

## Phase 4: Entity Movement (ECS)

**Goal:** Walking and Pathfinding

### 4.1 Lightweight ECS Design

```
nova-core/domain/model/room/unit/
├── RoomUnit.java                  # Entity container
├── RoomUnitId.java                # Value object
├── RoomUnitType.java              # Enum: USER, BOT, PET
├── components/
│   ├── PositionComponent.java     # x, y, z, bodyRotation, headRotation
│   ├── MovementComponent.java     # path queue, goalTile, isWalking
│   ├── StatusComponent.java       # sit, lay, sign, effect, handItem
│   └── IdentityComponent.java     # linkedId, figure, name, motto
└── systems/
    ├── MovementSystem.java        # Processes path each tick
    ├── StatusSystem.java          # Updates effects, idle timers
    └── CollisionSystem.java       # Validates movement
```

### 4.2 Component Definitions

```java
// Immutable - replaced on update
public record PositionComponent(
    short x,
    short y,
    double z,
    int bodyRotation,
    int headRotation
) {}

// Mutable - modified by MovementSystem
public class MovementComponent {
    private final Deque<RoomTile> path = new LinkedList<>();
    private RoomTile goalTile;
    private boolean isWalking;
    private boolean fastWalk;
    private long lastMovementTime;

    public Optional<RoomTile> pollNextTile() {
        return Optional.ofNullable(path.poll());
    }

    public void setPath(Deque<RoomTile> newPath) {
        this.path.clear();
        this.path.addAll(newPath);
        this.isWalking = !newPath.isEmpty();
    }
}

// Status flags
public class StatusComponent {
    private final Map<RoomUnitStatus, String> statuses = new ConcurrentHashMap<>();
    private int effectId;
    private long effectEndTime;
    private int handItemId;
    private long handItemEndTime;
    private int idleTicks;

    public void addStatus(RoomUnitStatus status, String value) {
        statuses.put(status, value);
    }

    public void removeStatus(RoomUnitStatus status) {
        statuses.remove(status);
    }
}
```

### 4.3 A* Pathfinding

**Port from Legacy:**
```
legacy-arcturus/.../rooms/pathfinding/impl/PathfinderImpl.java
```

**Nova Implementation:**
```java
// nova-core/domain/service/pathfinding/AStarPathfinder.java
public class AStarPathfinder implements Pathfinder {

    private static final int STRAIGHT_COST = 10;
    private static final int DIAGONAL_COST = 14;
    private static final long TIMEOUT_MS = 25;

    private final double maxStepHeight;
    private final boolean allowFalling;
    private final boolean allowDiagonal;

    @Override
    public Deque<RoomTile> findPath(
            RoomLayout layout,
            RoomTile start,
            RoomTile goal,
            RoomUnit unit) {

        if (start.equals(goal)) {
            return new ArrayDeque<>();
        }

        long startTime = System.currentTimeMillis();

        PriorityQueue<RoomTile> openList = new PriorityQueue<>(
            Comparator.comparingInt(RoomTile::getFCost));
        Set<RoomTile> closedList = new HashSet<>();

        start.setGCost(0);
        start.setHCost(calculateHeuristic(start, goal));
        openList.add(start);

        while (!openList.isEmpty()) {
            // Timeout check
            if (System.currentTimeMillis() - startTime > TIMEOUT_MS) {
                return new ArrayDeque<>();
            }

            RoomTile current = openList.poll();

            if (current.equals(goal)) {
                return tracePath(current);
            }

            closedList.add(current);

            for (RoomTile neighbor : getNeighbors(layout, current)) {
                if (closedList.contains(neighbor)) continue;
                if (!isWalkable(neighbor, current, unit)) continue;

                int tentativeG = current.getGCost() +
                    (isDiagonal(current, neighbor) ? DIAGONAL_COST : STRAIGHT_COST);

                if (tentativeG < neighbor.getGCost() || !openList.contains(neighbor)) {
                    neighbor.setGCost(tentativeG);
                    neighbor.setHCost(calculateHeuristic(neighbor, goal));
                    neighbor.setPrevious(current);

                    if (!openList.contains(neighbor)) {
                        openList.add(neighbor);
                    }
                }
            }
        }

        return new ArrayDeque<>(); // No path found
    }

    private int calculateHeuristic(RoomTile from, RoomTile to) {
        // Manhattan distance
        return (Math.abs(from.getX() - to.getX()) +
                Math.abs(from.getY() - to.getY())) * STRAIGHT_COST;
    }

    private Deque<RoomTile> tracePath(RoomTile goal) {
        Deque<RoomTile> path = new ArrayDeque<>();
        RoomTile current = goal;
        while (current.getPrevious() != null) {
            path.addFirst(current);
            current = current.getPrevious();
        }
        return path;
    }
}
```

### 4.4 Room Cycle Task

**Legacy Pattern (from `RoomCycleManager.java`):**
- 500ms tick interval
- Process each unit's movement
- Broadcast status updates

**Nova Implementation:**
```java
// nova-core/domain/service/RoomCycleService.java
public class RoomCycleService {

    private final MovementSystem movementSystem;
    private final StatusSystem statusSystem;

    public void cycle(Room room) {
        Set<RoomUnit> updatedUnits = new HashSet<>();

        for (RoomUnit unit : room.getUnits()) {
            // Process movement
            if (movementSystem.tick(unit, room)) {
                updatedUnits.add(unit);
            }

            // Process status (idle, effects)
            statusSystem.tick(unit);
        }

        // Broadcast updates
        if (!updatedUnits.isEmpty()) {
            room.broadcast(new RoomUnitStatusMessage(updatedUnits));
        }
    }
}
```

**Movement System:**
```java
public class MovementSystem {

    public boolean tick(RoomUnit unit, Room room) {
        MovementComponent movement = unit.getMovement();

        if (!movement.isWalking()) {
            return false;
        }

        Optional<RoomTile> nextTile = movement.pollNextTile();
        if (nextTile.isEmpty()) {
            movement.setWalking(false);
            return checkSitLay(unit, room);
        }

        RoomTile tile = nextTile.get();

        // Update position
        PositionComponent oldPos = unit.getPosition();
        int newRotation = calculateRotation(oldPos.x(), oldPos.y(), tile.getX(), tile.getY());

        unit.setPosition(new PositionComponent(
            tile.getX(),
            tile.getY(),
            tile.getStackHeight(),
            newRotation,
            newRotation
        ));

        // Update tile occupancy
        room.getLayout().getTile(oldPos.x(), oldPos.y()).removeUnit(unit);
        tile.addUnit(unit);

        // Add MOVE status
        unit.getStatus().addStatus(RoomUnitStatus.MOVE,
            tile.getX() + "," + tile.getY() + "," + tile.getStackHeight());

        return true;
    }
}
```

### 4.5 Scheduling the Cycle

```java
// In RoomService when room loads
private void startRoomCycle(Room room) {
    ScheduledFuture<?> task = scheduler.scheduleAtFixedRate(
        () -> roomTaskScheduler.execute(room.getId(), () -> {
            roomCycleService.cycle(room);
        }),
        500, 500, TimeUnit.MILLISECONDS
    );
    room.setCycleTask(task);
}
```

---

## Legacy Reference Files

### Phase 1 - Authentication
| File                                                                    | Purpose                           |
|-------------------------------------------------------------------------|-----------------------------------|
| `legacy-arcturus/.../messages/incoming/handshake/SecureLoginEvent.java` | Full login flow, all packets sent |
| `legacy-arcturus/.../habbohotel/users/HabboManager.java:104-163`        | `loadHabbo(sso)` method           |
| `legacy-arcturus/.../habbohotel/users/HabboInfo.java`                   | All user columns from DB          |
| `legacy-arcturus/.../habbohotel/users/Habbo.java`                       | User entity structure             |

### Phase 2 - Concurrency
| File                                                         | Purpose                   |
|--------------------------------------------------------------|---------------------------|
| `legacy-arcturus/.../habbohotel/rooms/RoomCycleManager.java` | 500ms tick implementation |
| `legacy-arcturus/.../threading/HabboExecutorService.java`    | Thread pool patterns      |
| `legacy-arcturus/.../core/Scheduler.java`                    | Task scheduling           |

### Phase 3 - Room Engine
| File                                                           | Purpose              |
|----------------------------------------------------------------|----------------------|
| `legacy-arcturus/.../habbohotel/rooms/RoomLayout.java:104-159` | Heightmap parsing    |
| `legacy-arcturus/.../habbohotel/rooms/RoomTile.java`           | Tile entity          |
| `legacy-arcturus/.../habbohotel/rooms/RoomTileState.java`      | Tile states enum     |
| `legacy-arcturus/.../habbohotel/rooms/RoomManager.java`        | Room loading/caching |
| `legacy-arcturus/.../habbohotel/rooms/Room.java:79-91`         | Manager composition  |

### Phase 4 - Movement/ECS
| File                                                                        | Purpose                   |
|-----------------------------------------------------------------------------|---------------------------|
| `legacy-arcturus/.../habbohotel/rooms/RoomUnit.java`                        | Unit entity with movement |
| `legacy-arcturus/.../habbohotel/rooms/pathfinding/Pathfinder.java`          | Interface                 |
| `legacy-arcturus/.../habbohotel/rooms/pathfinding/impl/PathfinderImpl.java` | A* algorithm              |
| `legacy-arcturus/.../util/pathfinding/Rotation.java`                        | Direction calculations    |

---

## Database Schema

**Location:** `database/schema.sql`

The schema is fully normalized with proper foreign key relationships and CASCADE deletes.

### Core Tables Structure

```
Core Identity:
├── users              # id, username, email, password_hash, rank_id, created_at
├── user_data          # user_id, motto, figure, gender, online, last_login_at...
├── user_tickets       # SSO tokens (id, user_id, ticket, expires_at, is_used)
├── user_currencies    # (user_id, currency_type, amount) - flexible multi-currency
└── user_settings      # User preferences (volumes, navigator position, etc.)

Permissions (Flexible Many-to-Many):
├── ranks                    # id, name, badge, level, prefix, prefix_color
├── permission_categories    # Grouping for permissions
├── permissions              # id, permission_key, name, description, is_dangerous
├── rank_permissions         # (rank_id, permission_id) - permissions per rank
└── user_permissions         # (user_id, permission_id, granted) - individual overrides

Rooms (Normalized):
├── rooms              # Core data: id, owner_id, name, description, model_name, state
├── room_settings      # Configurable options: max_users, chat_*, trade_state, etc.
├── room_decoration    # Visual: background_color, mood_light_data, jukebox_*
├── room_models        # Heightmaps: name, heightmap, door_x, door_y, door_dir
├── room_rights        # (room_id, user_id)
├── room_bans          # (room_id, user_id, banned_by_id, expires_at)
└── room_mutes         # (room_id, user_id, muted_by_id, expires_at)
```

### Key Schema Features

- **Proper foreign keys** with `ON DELETE CASCADE`
- **ENUM types** for state fields (gender, room state, chat mode)
- **Flexible permissions** via many-to-many (not hardcoded booleans)
- **Multi-currency** support via `user_currencies` table
- **SSO tickets** with expiration and usage tracking
- **Separated room tables** for settings, decoration, rights

---

## Implementation Priority

```
Week 1-2: PHASE 1 - Authentication
├── 1.1 Unified annotation scanner ✅ DONE
│   ├── @ParsesPacket, @ComposesPacket, @HandlesPacket annotations
│   ├── PacketScanner with ClassGraph
│   └── Base classes updated (backwards compatible)
├── 1.2 Complete authentication flow ✅ DONE (Handshake complete)
│   ├── ClientHelloHandler (packet 4000) - initial connection
│   ├── SsoTicketHandler (packet 2419) - SSO auth + user loading
│   ├── UniqueIDHandler (packet 2490) - machine ID tracking
│   └── WebSocketBinaryEncoder - BinaryWebSocketFrame wrapping
├── 1.3 Database Layer ✅ DONE
│   ├── Jdbi 3 integration with SqlObject plugin
│   ├── Normalized schema (database/schema.sql)
│   ├── UserDao, UserDataDao, UserTicketDao, UserCurrencyDao
│   └── JdbiUserRepository combining normalized tables
└── 1.4 Test: Client → Hotel View ✅ DONE (Nitro connects + authenticates)

Week 3-4: PHASE 2 - Concurrency
├── 2.1 RoomTaskScheduler interface
├── 2.2 StripedRoomTaskScheduler impl
└── 2.3 Guice binding + integration

Week 5-6: PHASE 3 - Room Engine
├── 3.1 Room domain model
├── 3.2 RoomRepository interface + MySQL impl
├── 3.3 Heightmap parsing
├── 3.4 Room entry handlers
└── 3.5 Test: Enter room → See model

Week 7-8: PHASE 4 - Movement
├── 4.1 RoomUnit ECS components
├── 4.2 A* Pathfinder
├── 4.3 MovementSystem
├── 4.4 Room cycle task (500ms)
└── 4.5 Test: Walk in room
```

---

## Quick Start Commands

```bash
# Build
mvn clean install -DskipTests

# Run
java -jar nova-app/target/NovaEmulator.jar

# Run with debug
java -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5005 \
     -jar nova-app/target/NovaEmulator.jar
```

---

*Document generated by Claude Code - January 2026*