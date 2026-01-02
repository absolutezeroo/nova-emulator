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
│  │    (Netty)          │                         │  • InMemorySession      │  │
│  │  • PacketHandlers   │                         │    Repository           │  │
│  │    (future)         │                         │                         │  │
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
    │       │   └── UserUseCase.java
    │       └── out/        # Output Ports (Repository interfaces)
    │           ├── UserRepository.java
    │           └── SessionRepository.java
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
    │   │       └── GameServer.java      # Netty server
    │   └── out/            # Outbound Adapters (driven by application)
    │       └── persistence/
    │           ├── MySqlUserRepository.java
    │           └── InMemorySessionRepository.java
    └── config/
        └── DatabaseConfig.java          # HikariCP configuration
```

**Inbound Adapters:** Receive external requests and translate them into calls to input ports.
- `GameServer`: Netty-based TCP server accepting Habbo client connections

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