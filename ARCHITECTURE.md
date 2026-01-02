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
│  │  • GameServer       │                         │  • MySqlUserRepository  │  │
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
    ├── domain/
    │   ├── model/          # Entities and Value Objects
    │   │   ├── User.java        # Aggregate root
    │   │   └── UserId.java      # Value object (record)
    │   └── port/
    │       ├── in/         # Input Ports (Use Case interfaces)
    │       │   ├── UserUseCase.java
    │       │   └── network/
    │       │       └── ConnectionListener.java  # Network event callbacks
    │       └── out/        # Output Ports (Repository/Gateway interfaces)
    │           ├── UserRepository.java
    │           ├── SessionRepository.java
    │           └── network/
    │               ├── NetworkConnection.java   # Abstract client connection
    │               └── GameServerPort.java      # Abstract server lifecycle
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
    │   ├── in/             # Inbound Adapters (drive the application)
    │   │   └── network/
    │   │       ├── codec/                       # Netty codecs
    │   │       │   ├── ClientMessage.java           # Inbound packet DTO
    │   │       │   ├── GameByteFrameDecoder.java    # 4-byte length framing
    │   │       │   └── GamePacketDecoder.java       # Packet decoder
    │   │       ├── handler/                     # Netty handlers
    │   │       │   ├── GameHandler.java             # Routes to PacketDispatcher
    │   │       │   └── PolicyFileHandler.java       # Flash policy XML
    │   │       ├── packets/                     # Packet handling system
    │   │       │   ├── IIncomingPacket.java         # Marker interface
    │   │       │   ├── IOutgoingPacket.java         # Marker interface
    │   │       │   ├── PacketDispatcher.java        # Central dispatcher
    │   │       │   ├── parsers/                     # Bytes → Typed events
    │   │       │   ├── handlers/                    # Events → Use cases
    │   │       │   ├── composers/                   # Messages → Bytes
    │   │       │   ├── incoming/                    # Incoming event DTOs
    │   │       │   └── outgoing/                    # Outgoing message DTOs
    │   │       ├── session/                     # Connection management
    │   │       │   └── NettyConnection.java         # Implements NetworkConnection
    │   │       ├── server/                      # TCP server
    │   │       │   ├── GameServer.java              # Implements GameServerPort
    │   │       │   └── GameChannelInitializer.java  # TCP pipeline
    │   │       └── websocket/                   # WebSocket server
    │   │           ├── WebSocketGameServer.java     # Implements GameServerPort
    │   │           ├── WebSocketChannelInitializer.java
    │   │           └── WebSocketFrameHandler.java
    │   └── out/            # Outbound Adapters (driven by application)
    │       └── persistence/
    │           ├── MySqlUserRepository.java
    │           └── InMemorySessionRepository.java
    └── config/
        └── DatabaseConfig.java          # HikariCP configuration
```

**Inbound Adapters:** Receive external requests and translate them into calls to input ports.
- `server/GameServer`: Netty TCP server for Flash/Air clients (port 30000) - implements `GameServerPort`
- `websocket/WebSocketGameServer`: Netty WebSocket server for Nitro HTML5 (port 2096) - implements `GameServerPort`
- `session/NettyConnection`: Wraps Netty Channel - implements `NetworkConnection`

**Outbound Adapters:** Implement output ports to interact with external systems.
- `MySqlUserRepository`: Persists users to MySQL via HikariCP
- `InMemorySessionRepository`: Tracks online users in memory

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
   a. userRepository.findBySsoTicket()  ──▶  MySqlUserRepository (SQL query)
   b. userRepository.invalidateSsoTicket()
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

The packet handling system follows the Uriel architecture pattern, adapted for Hexagonal Architecture.

### Components

| Component | Responsibility |
|-----------|----------------|
| `PacketParser<T>` | Converts raw bytes (ClientMessage) → typed event (IIncomingPacket) |
| `PacketHandler<T>` | Processes events, calls domain use cases, sends responses |
| `PacketComposer<T>` | Serializes messages (IOutgoingPacket) → PacketBuffer |
| `PacketBuffer` | Low-level buffer for packet serialization |
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
2. Create parser extending `PacketParser<T>` in `packets/parsers/`
3. Create handler extending `PacketHandler<T>` in `packets/handlers/`
4. Register in `InfrastructureModule`

**Outgoing packet (server → client):**
1. Create message class implementing `IOutgoingPacket` in `packets/outgoing/`
2. Create composer extending `PacketComposer<T>` in `packets/composers/`
3. Register in `InfrastructureModule`

### Example: SSO Authentication

```
packets/
├── headers/
│   ├── Incoming.java           # SSO_TICKET = 2419
│   └── Outgoing.java           # AUTHENTICATED = 2491, USER_INFO = 3578, USER_CREDITS = 3475
├── parsers/handshake/
│   └── SsoTicketParser.java    # Parses SSO ticket string
├── handlers/handshake/
│   └── SsoTicketHandler.java   # Authenticates user, sends responses
├── composers/handshake/
│   └── AuthenticatedComposer.java
├── composers/users/
│   ├── UserInfoComposer.java
│   └── UserCreditsComposer.java
├── incoming/handshake/
│   └── SsoTicketMessageEvent.java
└── outgoing/
    ├── handshake/AuthenticatedMessage.java
    └── users/UserInfoMessage.java, UserCreditsMessage.java
```

## Dependency Injection

Guice binds interfaces to implementations at startup:

```java
// CoreModule.java
bind(UserUseCase.class).to(UserService.class);

// InfrastructureModule.java
bind(UserRepository.class).to(MySqlUserRepository.class);
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

1. **Define the port** in `nova-core/domain/port/in/` (e.g., `RoomUseCase`)
2. **Create domain model** in `nova-core/domain/model/` (e.g., `Room`, `RoomId`)
3. **Define repository port** in `nova-core/domain/port/out/` (e.g., `RoomRepository`)
4. **Implement use case** in `nova-app/service/` (e.g., `RoomService`)
5. **Implement adapter** in `nova-infra/adapter/out/` (e.g., `MySqlRoomRepository`)
6. **Add packet handlers** in `nova-infra/adapter/in/network/packets/`
7. **Wire in Guice modules**

### Adding New Packets

See the [Packet System](#packet-system) section for detailed instructions. Quick summary:

```java
// 1. Parser (incoming)
public class MyPacketParser extends PacketParser<MyEvent> {
    public int getHeaderId() { return Incoming.MY_PACKET; }
    public MyEvent parse(ClientMessage msg) { return new MyEvent(msg.readString()); }
}

// 2. Handler (business logic)
public class MyHandler extends PacketHandler<MyEvent> {
    public void handle(NetworkConnection conn, MyEvent event) {
        // Call use case, compose response
    }
}

// 3. Composer (outgoing)
public class MyComposer extends PacketComposer<MyResponse> {
    public int getPacketId() { return Outgoing.MY_RESPONSE; }
    protected void write(PacketBuffer packet, MyResponse msg) {
        packet.appendString(msg.data());
    }
}

// 4. Register in InfrastructureModule
parserManager.register(new MyPacketParser());
handlerManager.register(MyEvent.class, new MyHandler(...));
composerManager.register(MyResponse.class, new MyComposer());
```

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
nova-core/domain/port/in/RoomTaskScheduler.java     # Interface (port)
nova-infra/.../concurrency/StripedRoomTaskScheduler.java  # Implementation
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
| PacketParser | Singleton | Stateless, reused for all packets |
| PacketHandler | Singleton | Holds injected dependencies only |
| PacketComposer | Singleton | Stateless, reused for all packets |
| IIncomingPacket | Per-request | Short-lived DTO, GC-friendly |
| IOutgoingPacket | Per-request | Short-lived DTO, GC-friendly |
| PacketBuffer | Per-response | Uses pooled ByteBuf, recycled automatically |