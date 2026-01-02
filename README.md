# NovaEmulator

A modern Habbo Hotel emulator built with Hexagonal Architecture in Java 21.

## Requirements

- Java 21+
- Maven 3.8+
- MySQL 8.0+

## Quick Start

### 1. Database Setup

Create a MySQL database and import your Habbo CMS schema. The emulator expects a `users` table with standard columns (`id`, `username`, `motto`, `look`, `credits`, `account_created`, `auth_ticket`).

### 2. Configuration

Edit database credentials in `nova-app/src/main/java/com/nova/app/config/InfrastructureModule.java`:

```java
private static final String DB_HOST = "localhost";
private static final int DB_PORT = 3306;
private static final String DB_NAME = "nova";
private static final String DB_USER = "nova";
private static final String DB_PASS = "nova";
```

### 3. Build

```bash
mvn clean package
```

### 4. Run

```bash
java -jar nova-app/target/NovaEmulator.jar
```

The emulator starts two servers:
- **TCP port 30000** - Flash/Air client connections
- **WebSocket port 2096** - Nitro HTML5 client connections

## Project Structure

```
nova-emulator/
├── nova-core/           # Domain layer (entities, ports, business rules)
│   └── domain/port/
│       ├── in/          # Input ports (UserUseCase, ConnectionListener)
│       └── out/         # Output ports (Repositories, NetworkConnection, GameServerPort)
├── nova-infra/          # Infrastructure (Netty servers, MySQL repositories)
│   └── adapter/in/network/
│       ├── codec/       # Packet encoding/decoding
│       ├── handler/     # Netty handlers (GameHandler, PolicyFileHandler)
│       ├── session/     # Connection management (NettyConnection)
│       ├── server/      # TCP server (GameServer, GameChannelInitializer)
│       └── websocket/   # WebSocket server
├── nova-app/            # Application bootstrap and DI configuration
└── pom.xml              # Parent POM
```

## Tech Stack

| Component | Technology |
|-----------|------------|
| Language | Java 21 |
| Build | Maven |
| DI | Google Guice |
| Networking | Netty 4.1 |
| Database | MySQL + HikariCP |
| Logging | SLF4J + Logback |
| Testing | JUnit 5 + Mockito + AssertJ |

## Development

```bash
# Run tests
mvn test

# Run single test
mvn test -Dtest=ClassName#methodName

# Build without tests
mvn install -DskipTests
```

## Architecture

See [ARCHITECTURE.md](ARCHITECTURE.md) for detailed architectural documentation.

## License

MIT