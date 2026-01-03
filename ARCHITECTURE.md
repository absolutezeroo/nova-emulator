# Architecture

NovaEmulator follows **Hexagonal Architecture** (also known as Ports and Adapters), ensuring a clean separation between business logic and infrastructure concerns.

## Overview

```
                    ┌─────────────────────────────────────────────────┐
                    │                   nova-app                       │
                    │         (Composition Root / Bootstrap)           │
                    └─────────────────────────────────────────────────┘
                                          │
                                          ▼
┌───────────────────────────────────────────────────────────────────────────────┐
│                              nova-infra                                        │
│  ┌─────────────────────┐                         ┌─────────────────────────┐  │
│  │   Inbound Adapters  │                         │    Outbound Adapters    │  │
│  │                     │                         │                         │  │
│  │  • GameServer       │                         │  • JdbiUserRepository   │  │
│  │    (TCP:30000)      │                         │  • InMemorySession      │  │
│  │  • WebSocketServer  │                         │    Repository           │  │
│  │    (WS:2096)        │                         │                         │  │
│  └──────────┬──────────┘                         └────────────▲────────────┘  │
│             │ calls                                implements │               │
└─────────────│─────────────────────────────────────────────────│───────────────┘
              │                                                 │
              ▼                                                 │
┌───────────────────────────────────────────────────────────────────────────────┐
│                              nova-core                                         │
│  ┌─────────────────────┐     ┌─────────────────┐     ┌─────────────────────┐  │
│  │    Input Ports      │     │  Domain Model   │     │   Output Ports      │  │
│  │    (Use Cases)      │     │                 │     │   (Repositories)    │  │
│  │                     │     │  • User         │     │                     │  │
│  │  • UserUseCase      │────▶│  • UserId       │◀────│  • UserRepository   │  │
│  │                     │     │                 │     │  • SessionRepository│  │
│  └─────────────────────┘     └─────────────────┘     └─────────────────────┘  │
│                                                                                │
│                         No external dependencies                               │
└────────────────────────────────────────────────────────────────────────────────┘
```

## Module Responsibilities

### nova-core (Domain Layer)

The heart of the application. Contains pure business logic with **zero framework dependencies**.

```
nova-core/
└── src/main/java/com/nova/core/
    ├── application/
    │   ├── command/        # Command DTOs for use cases
    │   │   └── AuthenticateCommand.java
    │   └── result/         # Result DTOs from use cases
    │       └── AuthenticationResult.java
    ├── domain/
    │   ├── model/          # Entities and Value Objects
    │   │   ├── User.java        # Aggregate root
    │   │   ├── UserId.java      # Value object (record)
    │   │   └── user/            # User-related value objects
    │   │       ├── UserData.java
    │   │       ├── UserRank.java
    │   │       └── UserCurrencies.java
    │   ├── api/            # Input Ports (Use Case interfaces)
    │   │   ├── user/
    │   │   │   └── UserUseCase.java
    │   │   ├── room/
    │   │   │   └── RoomTaskScheduler.java
    │   │   └── network/
    │   │       └── ConnectionListener.java  # Network event callbacks
    │   ├── repository/     # Output Ports (Data persistence)
    │   │   ├── UserRepository.java
    │   │   └── SessionRepository.java
    │   └── gateway/        # Output Ports (External systems)
    │       ├── NetworkConnection.java   # Abstract client connection
    │       └── GameServerPort.java      # Abstract server lifecycle
    └── exception/          # Domain exceptions
        ├── DomainException.java
        └── UserNotFoundException.java
```

**Rules:**
- No Spring, no Guice, no Netty - only pure Java
- SLF4J API allowed (logging abstraction only)
- Entities have behavior methods, not setters
- Repositories are interfaces, not implementations

### nova-infra (Infrastructure Layer)

Implements the ports defined in core with concrete technologies.

```
nova-infra/
└── src/main/java/com/nova/infra/
    ├── adapter/
    │   ├── concurrency/                   # Threading utilities
    │   │   └── StripedRoomTaskScheduler.java  # Implements RoomTaskScheduler
    │   ├── persistence/                   # Persistence Adapters
    │   │   ├── dao/                       # Jdbi SqlObject interfaces (by domain)
    │   │   │   ├── user/                      # UserDao, UserDataDao, UserTicketDao, etc.
    │   │   │   ├── permission/                # RankDao, PermissionDao
    │   │   │   ├── messenger/                 # MessengerDao
    │   │   │   ├── room/                      # RoomDao, RoomSettingsDao, RoomModelDao, etc.
    │   │   │   ├── item/                      # ItemDefinitionDao, ItemDao
    │   │   │   ├── catalog/                   # CatalogDao
    │   │   │   ├── badge/                     # BadgeDao
    │   │   │   ├── moderation/                # ModerationDao
    │   │   │   └── config/                    # ConfigDao
    │   │   ├── entity/                    # Java record mappings (by domain)
    │   │   │   ├── user/                      # UserEntity, UserDataEntity, etc.
    │   │   │   ├── permission/                # RankEntity, PermissionEntity, etc.
    │   │   │   ├── messenger/                 # FriendshipEntity, etc.
    │   │   │   ├── room/                      # RoomEntity, RoomSettingsEntity, etc.
    │   │   │   ├── item/                      # ItemDefinitionEntity, ItemEntity
    │   │   │   ├── catalog/                   # CatalogPageEntity, CatalogItemEntity
    │   │   │   ├── badge/                     # BadgeDefinitionEntity, UserBadgeEntity
    │   │   │   ├── moderation/                # BanEntity, ModLogEntity, ChatLogEntity
    │   │   │   └── config/                    # EmulatorSettingEntity, etc.
    │   │   └── repository/
    │   │       └── JdbiUserRepository.java
    │   └── network/                       # Network Adapters
    │       ├── codec/                       # Netty codecs
    │       │   ├── ClientMessage.java           # Inbound packet DTO
    │       │   ├── GameByteFrameDecoder.java    # 4-byte length framing
    │       │   └── GamePacketDecoder.java       # Packet decoder
    │       ├── handler/                     # Netty handlers
    │       │   ├── GameHandler.java             # Routes to PacketDispatcher
    │       │   └── PolicyFileHandler.java       # Flash policy XML
    │       ├── packets/                     # Packet handling system
    │       │   ├── IIncomingPacket.java         # Marker interface
    │       │   ├── IOutgoingPacket.java         # Marker interface
    │       │   ├── PacketDispatcher.java        # Central dispatcher
    │       │   ├── parsers/                     # Bytes → Typed events
    │       │   ├── handlers/                    # Events → Use cases
    │       │   ├── composers/                   # Messages → Bytes
    │       │   ├── incoming/                    # Incoming event DTOs
    │       │   └── outgoing/                    # Outgoing message DTOs
    │       ├── session/                     # Connection management
    │       │   └── NettyConnection.java         # Implements NetworkConnection
    │       ├── server/                      # TCP server
    │       │   ├── GameServer.java              # Implements GameServerPort
    │       │   └── GameChannelInitializer.java  # TCP pipeline
    │       └── websocket/                   # WebSocket server
    │           ├── WebSocketGameServer.java     # Implements GameServerPort
    │           ├── WebSocketChannelInitializer.java
    │           └── WebSocketFrameHandler.java
    └── config/
        └── DatabaseConfig.java          # HikariCP configuration
```

**Network Adapters:** Handle network communication with clients.
- `server/GameServer`: Netty TCP server for Flash/Air clients (port 30000) - implements `GameServerPort`
- `websocket/WebSocketGameServer`: Netty WebSocket server for Nitro HTML5 (port 2096) - implements `GameServerPort`
- `session/NettyConnection`: Wraps Netty Channel - implements `NetworkConnection`

**Persistence Adapters:** Handle data storage.
- `JdbiUserRepository`: Persists users to MySQL via Jdbi 3 + HikariCP

**Concurrency Adapters:** Handle threading concerns.
- `StripedRoomTaskScheduler`: Implements `RoomTaskScheduler` for thread-safe room operations

### nova-app (Application Layer)

The composition root that wires everything together.

```
nova-app/
└── src/main/java/com/nova/app/
    ├── NovaEmulator.java           # Main entry point
    ├── config/
    │   ├── CoreModule.java         # Guice: binds use cases
    │   └── InfrastructureModule.java  # Guice: binds adapters
    └── service/
        └── UserService.java        # Use case implementation
```

**Responsibilities:**
- Bootstrap the application
- Configure dependency injection
- Wire ports to adapters
- Provide logging implementation (Logback)

## Data Flow

### Authentication Example (SSO Login)

```
1. Client connects to GameServer (Netty)
          │
          ▼
2. GameHandler receives ClientMessage (header ID 2419)
          │
          ▼
3. PacketDispatcher routes to SsoTicketParser
          │ parses bytes into SsoTicketMessageEvent
          ▼
4. PacketDispatcher routes to SsoTicketHandler
          │
          ▼
5. SsoTicketHandler calls UserUseCase.authenticate(ssoTicket)
          │
          ▼
6. UserService (implementation) orchestrates:
   a. userRepository.findBySsoTicket()  ──▶  JdbiUserRepository
      - UserTicketDao.findValidTicket() (validates SSO)
      - UserDao.findById() (loads identity)
      - UserDataDao.findByUserId() (loads profile)
      - UserCurrencyDao.getCredits() (loads currencies)
   b. userRepository.invalidateSsoTicket()  ──▶  UserTicketDao.markAsUsed()
   c. user.markOnline()
   d. Returns User entity
          │
          ▼
7. SsoTicketHandler composes response packets:
   a. AuthenticatedMessage → AuthenticatedComposer → PacketBuffer
   b. UserInfoMessage → UserInfoComposer → PacketBuffer
   c. UserCreditsMessage → UserCreditsComposer → PacketBuffer
          │
          ▼
8. NettyConnection.send() writes ByteBuf to client
```

## Network Layer

### Hexagonal Network Abstraction

The network layer follows hexagonal principles - the domain defines abstract ports, infrastructure provides implementations:

```
┌─────────────────────────────────────────────────────────────────────────────┐
│                              nova-core                                       │
│  ┌───────────────────────────┐              ┌───────────────────────────┐   │
│  │   ConnectionListener      │              │    NetworkConnection      │   │
│  │   (Input Port)            │◀─────────────│    (Output Port)          │   │
│  │                           │   callbacks  │                           │   │
│  │   onConnect(connection)   │              │   send(Object response)   │   │
│  │   onCommand(conn, cmd)    │              │   disconnect()            │   │
│  │   onDisconnect(conn)      │              │   getIpAddress()          │   │
│  └───────────────────────────┘              └─────────────▲─────────────┘   │
│                                                           │ implements      │
└───────────────────────────────────────────────────────────│─────────────────┘
                                                            │
┌───────────────────────────────────────────────────────────│─────────────────┐
│                              nova-infra                   │                 │
│                                                           │                 │
│  Binary Packet ──▶ PacketParser ──▶ IIncomingPacket ──────┤                 │
│                                          │                │                 │
│                                          ▼                │                 │
│                               PacketHandler ──▶ UseCase   │                 │
│                                          │                │                 │
│  ┌─────────────────────────┐ ◀───────────┘  ┌─────────────┴─────────────┐   │
│  │   GameServer            │                │    NettyConnection        │   │
│  │   implements            │                │    (hides Netty Channel)  │   │
│  │   GameServerPort        │                │                           │   │
│  └─────────────────────────┘                └───────────────────────────┘   │
│                                                           │                 │
│  PacketBuffer ◀── PacketComposer ◀── IOutgoingPacket ◀────┘                 │
└─────────────────────────────────────────────────────────────────────────────┘
```

### Habbo Packet Structure

All Habbo packets follow this binary format:

```
┌──────────────┬──────────────┬─────────────────────┐
│   Length     │   Header ID  │       Body          │
│   4 bytes    │   2 bytes    │   Variable length   │
│  (int32 BE)  │  (int16 BE)  │                     │
└──────────────┴──────────────┴─────────────────────┘
```

### TCP Pipeline (Flash/Air Clients)

```
                          Inbound Flow
                              │
                              ▼
                    ┌─────────────────────┐
                    │  PolicyFileHandler  │  Detects <policy-file-request/>
                    │  (First byte check) │  Returns XML, closes connection
                    └──────────┬──────────┘
                              │ (if not policy)
                              ▼
                    ┌─────────────────────┐
                    │ GameByteFrameDecoder│  Extracts frames using
                    │ (LengthFieldBased)  │  4-byte length prefix
                    └──────────┬──────────┘
                              │
                              ▼
                    ┌─────────────────────┐
                    │  GamePacketDecoder  │  Reads 2-byte header ID
                    │  (ByteToMessage)    │  Creates ClientMessage
                    └──────────┬──────────┘
                              │
                              ▼
                    ┌─────────────────────┐
                    │     GameHandler     │  Routes to PacketDispatcher
                    │ (SimpleChannelIn)   │
                    └──────────┬──────────┘
                              │
                              ▼
                    ┌─────────────────────┐
                    │   PacketDispatcher  │  Parser → Handler → Response
                    │                     │  Composes outgoing packets
                    └─────────────────────┘
                              │
                              ▼
                    ┌─────────────────────┐
                    │    NettyConnection  │  Writes PacketBuffer.getBuffer()
                    │    send(ByteBuf)    │  directly to channel
                    └─────────────────────┘
```

### WebSocket Pipeline (Nitro HTML5 Client)

```
                          Inbound Flow
                              │
                              ▼
                    ┌─────────────────────┐
                    │   HttpServerCodec   │  HTTP request/response
                    └──────────┬──────────┘
                              │
                              ▼
                    ┌─────────────────────┐
                    │ HttpObjectAggregator│  Aggregates HTTP parts
                    └──────────┬──────────┘
                              │
                              ▼
                    ┌─────────────────────┐
                    │WebSocketProtocol    │  Handles WS upgrade,
                    │     Handler         │  ping/pong, close
                    └──────────┬──────────┘
                              │
                              ▼
                    ┌─────────────────────┐
                    │WebSocketFrameHandler│  Extracts ByteBuf from
                    │                     │  BinaryWebSocketFrame,
                    │                     │  decodes to ClientMessage
                    └──────────┬──────────┘
                              │
                              ▼
                    ┌─────────────────────┐
                    │   PacketDispatcher  │  Parser → Handler → Response
                    │                     │  Composes outgoing packets
                    └──────────┬──────────┘
                              │
                              ▼
                    ┌─────────────────────┐
                    │    NettyConnection  │  Wraps ByteBuf in
                    │  send(BinaryFrame)  │  BinaryWebSocketFrame
                    └─────────────────────┘
```

### Cross-Domain Policy (Flash)

When a Flash client connects, it first sends `<policy-file-request/>`. The server responds with:

```xml
<?xml version="1.0"?>
<!DOCTYPE cross-domain-policy SYSTEM "/xml/dtds/cross-domain-policy.dtd">
<cross-domain-policy>
<allow-access-from domain="*" to-ports="1-31111" />
</cross-domain-policy>
```

## Packet System

The packet handling system uses **annotation-based auto-discovery** with ClassGraph, adapted for Hexagonal Architecture. All packets are migrated from the Nitro HTML5 client with complete protocol coverage.

### Packet Statistics

| Component | Count | Description |
|-----------|-------|-------------|
| Incoming Headers | ~470 | Client → Server packet IDs (`Incoming.java`) |
| Outgoing Headers | ~472 | Server → Client packet IDs (`Outgoing.java`) |
| Parsers | ~457 | Parse client requests (`@ParsesPacket`) |
| Composers | ~447 | Compose server responses (`@ComposesPacket`) |
| Handlers | Auto-discovered | Business logic (`@HandlesPacket` + `@Inject`) |

### Naming Convention (Nitro → Nova)

Since Nitro is a client and Nova is a server, perspectives are inverted:

| Nitro (Client) | Nova (Server) | Description |
|----------------|---------------|-------------|
| `IncomingHeader.ts` | `Outgoing.java` | Server sends to client |
| `OutgoingHeader.ts` | `Incoming.java` | Client sends to server |
| `*MessageEvent.ts` | `*Message.java` | Outgoing message records |
| `*Composer.ts` | `*MessageEvent.java` | Incoming event records |

### Components

| Component | Responsibility |
|-----------|----------------|
| `@ParsesPacket` | Annotation marking parser with header ID |
| `@ComposesPacket` | Annotation marking composer with packet ID |
| `@HandlesPacket` | Annotation marking handler with event type |
| `PacketScanner` | ClassGraph-based scanner for auto-discovery |
| `PacketParser<T>` | Converts raw bytes (ClientMessage) → typed event |
| `PacketHandler<T>` | Processes events, calls domain use cases |
| `PacketComposer<T>` | Serializes messages → PacketBuffer |
| `PacketDispatcher` | Routes packets through parsers → handlers |

### Flow Diagram

```
┌─────────────────┐     ┌─────────────────┐     ┌─────────────────┐
│  ClientMessage  │────▶│  PacketParser   │────▶│ IIncomingPacket │
│  (headerId,body)│     │  (per headerID) │     │   (typed DTO)   │
└─────────────────┘     └─────────────────┘     └────────┬────────┘
                                                         │
                                                         ▼
┌─────────────────┐     ┌─────────────────┐     ┌─────────────────┐
│   PacketBuffer  │◀────│ PacketComposer  │◀────│  PacketHandler  │
│    (ByteBuf)    │     │  (per msgType)  │     │  → Use Cases    │
└─────────────────┘     └─────────────────┘     └─────────────────┘
```

### Adding New Packets

**Incoming packet (client → server):**
1. Create event class implementing `IIncomingPacket` in `packets/incoming/`
2. Create parser with `@ParsesPacket(Incoming.X)` in `packets/parsers/`
3. Create handler with `@HandlesPacket(Event.class)` + `@Inject` in `packets/handlers/`
4. **No manual registration needed** - auto-discovered

**Outgoing packet (server → client):**
1. Create message class implementing `IOutgoingPacket` in `packets/outgoing/`
2. Create composer with `@ComposesPacket(Outgoing.X)` in `packets/composers/`
3. **No manual registration needed** - auto-discovered

### Package Structure

```
packets/
├── annotations/                       # Auto-discovery system
│   ├── ParsesPacket.java              # @ParsesPacket(Incoming.X)
│   ├── ComposesPacket.java            # @ComposesPacket(Outgoing.X)
│   ├── HandlesPacket.java             # @HandlesPacket(Event.class)
│   └── PacketScanner.java             # ClassGraph-based scanner
├── headers/
│   ├── Incoming.java                  # ~470 incoming header IDs
│   └── Outgoing.java                  # ~472 outgoing header IDs
├── incoming/                          # Events from client (~459 records)
├── outgoing/                          # Messages to client (~447 records)
├── parsers/                           # @ParsesPacket annotated (~457)
├── composers/                         # @ComposesPacket annotated (~447)
└── handlers/                          # @HandlesPacket + @Inject annotated
```

### Example: SSO Authentication

```
packets/
├── headers/
│   ├── Incoming.java           # SECURITY_TICKET = 2419
│   └── Outgoing.java           # AUTHENTICATED = 2491, USER_INFO = 2725, USER_CREDITS = 3475
├── parsers/handshake/
│   └── SSOTicketParser.java    # Parses SSO ticket string
├── handlers/handshake/
│   └── SsoTicketHandler.java   # Authenticates user, sends responses
├── composers/handshake/
│   └── AuthenticatedComposer.java
├── composers/user/
│   ├── UserInfoComposer.java
│   └── UserCreditsComposer.java
├── incoming/handshake/
│   └── SSOTicketMessageEvent.java
└── outgoing/
    ├── handshake/AuthenticatedMessage.java
    └── user/UserInfoMessage.java, UserCreditsMessage.java
```

## Dependency Injection

Guice binds interfaces to implementations at startup:

```java
// CoreModule.java
bind(UserUseCase.class).to(UserService.class);

// InfrastructureModule.java
@Provides @Singleton
public Jdbi provideJdbi(HikariDataSource dataSource) {
    Jdbi jdbi = Jdbi.create(dataSource);
    jdbi.installPlugin(new SqlObjectPlugin());
    return jdbi;
}

@Provides @Singleton
public UserRepository provideUserRepository(Jdbi jdbi) {
    return new JdbiUserRepository(jdbi);
}

bind(SessionRepository.class).to(InMemorySessionRepository.class);
```

## Design Patterns

### Aggregate Root
`User` is an aggregate root - the only entry point for user-related operations.

### Value Objects
`UserId` is a value object (Java record) with built-in validation.

### Repository Pattern
Repositories abstract data access. The domain defines interfaces, infrastructure provides implementations.

### Ports and Adapters
- **Ports**: Interfaces in core (`UserUseCase`, `UserRepository`)
- **Adapters**: Implementations in infra (`GameServer`, `MySqlUserRepository`)

## Testing Strategy

| Layer | Test Type | Mocking |
|-------|-----------|---------|
| Domain (core) | Unit tests | Mock repositories |
| Adapters (infra) | Integration tests | Real database or testcontainers |
| Application | End-to-end | Full stack |

## Extending the Architecture

### Adding a New Feature

1. **Define the port** in `nova-core/domain/api/` (e.g., `RoomUseCase`)
2. **Create domain model** in `nova-core/domain/model/` (e.g., `Room`, `RoomId`)
3. **Define repository port** in `nova-core/domain/repository/` (e.g., `RoomRepository`)
4. **Implement use case** in `nova-app/service/` (e.g., `RoomService`)
5. **Implement adapter** in `nova-infra/adapter/persistence/` (e.g., `JdbiRoomRepository`)
6. **Add packet handlers** in `nova-infra/adapter/network/packets/`
7. **Wire in Guice modules**

### Adding New Packets (Extending Architecture)

**Outgoing (server → client):**
1. Create `outgoing/{category}/MyMessage.java` (record implementing `IOutgoingPacket`)
2. Create `composers/{category}/MyComposer.java` with `@ComposesPacket(Outgoing.X)`
3. Add header constant to `Outgoing.java`
4. **Auto-discovered at startup** - no manual registration

**Incoming (client → server):**
1. Create `incoming/{category}/MyMessageEvent.java` (record implementing `IIncomingPacket`)
2. Create `parsers/{category}/MyParser.java` with `@ParsesPacket(Incoming.X)`
3. Create `handlers/{category}/MyHandler.java` with `@HandlesPacket(Event.class)` + `@Inject`
4. Add header constant to `Incoming.java`
5. **Auto-discovered at startup** - no manual registration

**Code Examples:**

```java
// Message record (outgoing - server → client)
public record UserInfoMessage(
    int userId,
    String username,
    String figure
) implements IOutgoingPacket {}

// Composer with @ComposesPacket annotation
@ComposesPacket(Outgoing.USER_INFO)
public class UserInfoComposer extends PacketComposer<UserInfoMessage> {
    @Override
    protected void write(PacketBuffer packet, UserInfoMessage msg) {
        packet.appendInt(msg.userId());
        packet.appendString(msg.username());
        packet.appendString(msg.figure());
    }
}

// Event record (incoming - client → server)
public record SSOTicketMessageEvent(
    String ssoTicket
) implements IIncomingPacket {}

// Parser with @ParsesPacket annotation
@ParsesPacket(Incoming.SECURITY_TICKET)
public class SSOTicketParser extends PacketParser<SSOTicketMessageEvent> {
    @Override
    public SSOTicketMessageEvent parse(ClientMessage message) {
        return new SSOTicketMessageEvent(message.readString());
    }
}

// Handler with @HandlesPacket + @Inject (jakarta.inject)
@HandlesPacket(SSOTicketMessageEvent.class)
public class SsoTicketHandler implements PacketHandler<SSOTicketMessageEvent> {
    private final UserUseCase userUseCase;
    private final PacketComposerManager composerManager;

    @Inject
    public SsoTicketHandler(UserUseCase userUseCase, PacketComposerManager composerManager) {
        this.userUseCase = userUseCase;
        this.composerManager = composerManager;
    }

    @Override
    public void handle(NetworkConnection connection, SSOTicketMessageEvent packet) {
        AuthenticationResult result = userUseCase.authenticate(...);
        connection.send(composerManager.compose(new AuthenticatedMessage()).getBuffer());
    }
}
```

**Packet Registration (Auto-Discovery):**

All components are auto-discovered via `PacketScanner` using ClassGraph:
```java
// In InfrastructureModule
PacketScanner.registerParsers(parserManager);      // Scans @ParsesPacket
PacketScanner.registerComposers(composerManager);  // Scans @ComposesPacket
PacketScanner.registerHandlers(handlerManager, injector);  // Scans @HandlesPacket with DI
```

**No manual registration needed** - just add the annotation and it's auto-discovered at startup.

### Adding New Adapters

Easily swap implementations:
- Replace MySQL with PostgreSQL: new `PostgresUserRepository` implementing `UserRepository`
- Add REST API: new inbound adapter calling existing use cases
- Add caching: decorator pattern around repository implementations

## Threading Model

### Current State (Stateless Operations)

For stateless operations (authentication, catalogue browsing, messenger), the current flow is thread-safe:

```
Netty EventLoop Thread → GameHandler → PacketDispatcher → Handler → UseCase
```

Each client has its own `NetworkConnection` and `User` object. No shared mutable state = no concurrency issues.

### Future: Shared State Operations (Rooms, Trades, Games)

When implementing features with shared mutable state, a **striped executor pattern** must be used to ensure thread-safety without blocking Netty's EventLoop threads.

#### Problem Scenario

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

#### Solution: RoomTaskScheduler

```
nova-core/domain/api/room/RoomTaskScheduler.java           # Interface (port)
nova-infra/adapter/concurrency/StripedRoomTaskScheduler.java  # Implementation
```

**Interface:**
```java
public interface RoomTaskScheduler {
    /**
     * Executes a task for a specific room.
     * Tasks for the same room run sequentially (FIFO).
     * Tasks for different rooms may run in parallel.
     */
    void execute(int roomId, Runnable task);

    <T> CompletableFuture<T> submit(int roomId, Supplier<T> task);

    void shutdown();
}
```

**Flow with scheduler:**
```
EventLoop-1 (Alice)              EventLoop-2 (Bob)
      │                                │
      ▼                                ▼
Handler.handle()                 Handler.handle()
      │                                │
      └──► scheduler.execute(roomId=42, task) ◄──┘
                       │
                       ▼
            ┌─────────────────────┐
            │  Room-42 TaskQueue  │
            │  [Alice's task]     │  ← Sequential execution
            │  [Bob's task]       │
            └─────────────────────┘
                       │
                       ▼
              Stripe-Thread-X
                       │
                       ▼
            1. Execute Alice's task
            2. Execute Bob's task
            (Never in parallel)
```

#### Implementation Guidelines

**Handlers WITHOUT shared state** (direct execution on EventLoop):
- `SsoTicketHandler` - Authentication
- `CatalogueHandler` - Read-only catalogue browsing
- `MessengerHandler` - Private messages (per-user state)
- `NavigatorHandler` - Room list browsing

**Handlers WITH shared state** (must use RoomTaskScheduler):
- `RoomItemHandler` - Move, rotate, pickup items
- `RoomUserHandler` - Walk, sit, dance, chat
- `TradeHandler` - Trading between users
- `GameHandler` - Wired, Battle Banzai, Freeze

**Example handler with scheduler:**
```java
public class RoomItemMoveHandler implements PacketHandler<MoveItemEvent> {

    private final RoomTaskScheduler scheduler;
    private final RoomUseCase roomUseCase;

    @Override
    public void handle(NetworkConnection conn, MoveItemEvent event) {
        // Returns immediately - non-blocking for EventLoop
        scheduler.execute(event.roomId(), () -> {
            // Executed on dedicated stripe thread
            // Only one task per room at a time
            roomUseCase.moveItem(event.roomId(), event.itemId(), event.x(), event.y());
        });
    }
}
```

#### Why NOT synchronized?

```java
// ❌ BAD - Blocks Netty EventLoop thread
public synchronized void moveItem(...) {
    // If this takes 50ms, ALL clients on this EventLoop are frozen
}

// ✅ GOOD - EventLoop returns immediately
scheduler.execute(roomId, () -> {
    // Blocking here is OK - it's a dedicated worker thread
    moveItem(...);
});
```

#### Stripe Count Recommendation

```java
// Recommended: CPU cores count
int stripeCount = Runtime.getRuntime().availableProcessors();
RoomTaskScheduler scheduler = new StripedRoomTaskScheduler(stripeCount);
```

- 4-core CPU → 4 stripes → Up to 4 rooms processed in parallel
- Rooms are mapped to stripes via `roomId % stripeCount`
- Same room always maps to same stripe → sequential execution guaranteed

## Memory Management

### ByteBuf Pooling

Always use Netty's pooled allocator for packet buffers:

```java
// ✅ GOOD - Uses Netty's buffer pool
PooledByteBufAllocator.DEFAULT.buffer(256)

// ❌ BAD - Allocates on heap every time
Unpooled.buffer()
```

`PacketBuffer` already uses `PooledByteBufAllocator` internally.

### Object Lifecycle

| Component | Lifecycle | Notes |
|-----------|-----------|-------|
| PacketParser | Singleton | `@ParsesPacket` annotated, stateless |
| PacketHandler | Singleton | `@HandlesPacket` + `@Inject`, Guice-instantiated |
| PacketComposer | Singleton | `@ComposesPacket` annotated, stateless |
| IIncomingPacket | Per-request | Short-lived DTO, GC-friendly |
| IOutgoingPacket | Per-request | Short-lived DTO, GC-friendly |
| PacketBuffer | Per-response | Uses pooled ByteBuf, recycled automatically |