package com.nova.infra.adapter.in.network.packets.parsers;

import com.nova.core.domain.port.out.network.NetworkConnection;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.IIncomingPacket;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Registry and manager for packet parsers.
 * <p>
 * Maps incoming packet IDs to their corresponding parsers.
 * Responsible for looking up and invoking the correct parser
 * when a packet arrives.
 */
public class PacketParserManager {

    private static final Logger LOGGER = LoggerFactory.getLogger(PacketParserManager.class);

    private final Map<Integer, PacketParser<?>> parsers = new ConcurrentHashMap<>();

    public PacketParserManager() {
        LOGGER.info("PacketParserManager initialized");
    }

    /**
     * Registers a parser for its packet ID.
     *
     * @param parser the parser to register
     * @return this manager for fluent chaining
     */
    public PacketParserManager register(PacketParser<?> parser) {
        PacketParser<?> existing = parsers.put(parser.getPacketId(), parser);

        if (existing != null) {
            LOGGER.warn("Replaced existing parser for packet ID {}", parser.getPacketId());
        } else {
            LOGGER.debug("Registered parser for packet ID {}: {}",
                    parser.getPacketId(), parser.getClass().getSimpleName());
        }

        return this;
    }

    /**
     * Parses an incoming client message.
     *
     * @param connection the client connection
     * @param message    the raw client message
     * @return the parsed packet event, or empty if no parser registered
     */
    public Optional<IIncomingPacket> parse(NetworkConnection connection, ClientMessage message) {
        int packetId = message.getHeaderId();
        PacketParser<?> parser = parsers.get(packetId);

        if (parser == null) {
            return Optional.empty();
        }

        try {
            IIncomingPacket packet = parser.parse(connection, message);
            LOGGER.debug("Parsed packet ID {} to {}", packetId, packet.getClass().getSimpleName());
            return Optional.of(packet);
        } catch (Exception e) {
            LOGGER.error("Error parsing packet ID {}: {}", packetId, e.getMessage(), e);
            return Optional.empty();
        }
    }

    /**
     * Gets the parser for a specific packet ID.
     */
    public Optional<PacketParser<?>> getParser(int packetId) {
        return Optional.ofNullable(parsers.get(packetId));
    }

    /**
     * Checks if a parser is registered for the given packet ID.
     */
    public boolean hasParser(int packetId) {
        return parsers.containsKey(packetId);
    }

    /**
     * Gets all registered packet IDs.
     */
    public Set<Integer> getRegisteredIds() {
        return Set.copyOf(parsers.keySet());
    }

    /**
     * Gets the count of registered parsers.
     */
    public int getParserCount() {
        return parsers.size();
    }
}
