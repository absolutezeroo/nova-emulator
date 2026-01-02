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
    │   │       ├── codec/                       # Packet encoding/decoding
    │   │       │   ├── ClientMessage.java           # Inbound packet DTO
    │   │       │   ├── ServerMessage.java           # Outbound packet DTO
    │   │       │   ├── MessageEncoder.java          # Domain→Wire interface
    │   │       │   ├── MessageDecoder.java          # Wire→Domain interface
    │   │       │   ├── GameByteFrameDecoder.java    # 4-byte length framing
    │   │       │   ├── GamePacketDecoder.java       # Packet decoder
    │   │       │   └── GamePacketEncoder.java       # Packet encoder
    │   │       ├── handler/                     # Netty handlers
    │   │       │   ├── GameHandler.java             # Packet processor
    │   │       │   └── PolicyFileHandler.java       # Flash policy XML
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

### Authentication Example

```
1. Client connects to GameServer (Netty)
          │
          ▼
2. PacketHandler receives SSO ticket
          │
          ▼
3. Calls UserUseCase.authenticate(ssoTicket)
          │
          ▼
4. UserService (implementation) orchestrates:
   a. userRepository.findBySsoTicket()  ──▶  MySqlUserRepository (SQL query)
   b. userRepository.invalidateSsoTicket()
   c. user.markOnline()
   d. Returns User entity
          │
          ▼
5. PacketHandler sends response to client
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
│  Binary Packet ──▶ MessageDecoder ──▶ Command DTO ────────┤                 │
│                                              (to core)    │                 │
│                                                           │                 │
│  ┌─────────────────────────┐              ┌───────────────┴─────────────┐   │
│  │   GameServer            │              │    NettyConnection          │   │
│  │   implements            │              │    (hides Netty Channel)    │   │
│  │   GameServerPort        │              │                             │   │
│  └─────────────────────────┘              └─────────────────────────────┘   │
│                                                                             │
│  Response DTO ◀── MessageEncoder ◀── UseCase result                        │
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
                    │     GameHandler     │  Routes to packet handlers
                    │ (SimpleChannelIn)   │  Based on header ID
                    └─────────────────────┘

                         Outbound Flow
                              │
                              ▼
                    ┌─────────────────────┐
                    │  GamePacketEncoder  │  Encodes ServerMessage
                    │  (MessageToByte)    │  to length+header+body
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
                    │  GamePacketEncoder  │  Encodes ServerMessage
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
6. **Wire in Guice modules**

### Adding New Adapters

Easily swap implementations:
- Replace MySQL with PostgreSQL: new `PostgresUserRepository` implementing `UserRepository`
- Add REST API: new inbound adapter calling existing use cases
- Add caching: decorator pattern around repository implementations