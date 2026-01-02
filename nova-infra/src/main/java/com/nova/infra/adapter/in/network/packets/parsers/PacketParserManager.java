package com.nova.infra.adapter.in.network.packets.parsers;

import com.nova.infra.adapter.in.network.packets.IIncomingPacket;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * Registry of packet parsers by header ID.
 * Routes incoming packets to the appropriate parser.
 */
public class PacketParserManager {

    private static final Logger log = LoggerFactory.getLogger(PacketParserManager.class);

    private final Map<Integer, PacketParser<?>> parsers = new HashMap<>();

    /**
     * Registers a parser for its header ID.
     *
     * @param parser The parser to register
     */
    public void register(PacketParser<?> parser) {
        int headerId = parser.getHeaderId();
        if (parsers.containsKey(headerId)) {
            log.warn("Overwriting parser for header ID: {}", headerId);
        }
        parsers.put(headerId, parser);
        log.debug("Registered parser for header ID: {}", headerId);
    }

    /**
     * Parses a client message using the registered parser for its header ID.
     *
     * @param message The client message to parse
     * @return The parsed packet, or null if no parser is registered
     */
    public IIncomingPacket parse(ClientMessage message) {
        int headerId = message.getHeaderId();
        PacketParser<?> parser = parsers.get(headerId);

        if (parser == null) {
            log.debug("No parser registered for header ID: {}", headerId);
            return null;
        }

        try {
            return parser.parse(message);
        } catch (Exception e) {
            log.error("Error parsing packet with header ID: {}", headerId, e);
            return null;
        }
    }

    /**
     * Checks if a parser is registered for the given header ID.
     *
     * @param headerId The header ID to check
     * @return true if a parser is registered
     */
    public boolean hasParser(int headerId) {
        return parsers.containsKey(headerId);
    }

    /**
     * Returns the number of registered parsers.
     *
     * @return The parser count
     */
    public int getParserCount() {
        return parsers.size();
    }
}
