package com.nova.infra.adapter.in.network.packets;

import com.nova.core.domain.port.out.network.NetworkConnection;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.composers.PacketComposerManager;
import com.nova.infra.adapter.in.network.packets.handlers.PacketHandlerManager;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.parsers.PacketParserManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;

/**
 * Central dispatcher for packet processing.
 * <p>
 * Coordinates the flow between parsers, handlers, and composers:
 * <pre>
 * Incoming: ClientMessage → Parser → Event → Handler → Business Logic
 * Outgoing: Message DTO → Composer → ByteBuf → Client
 * </pre>
 * <p>
 * This class is the main entry point for the packet system and
 * should be injected into Netty handlers.
 */
public class PacketDispatcher {

    private static final Logger LOGGER = LoggerFactory.getLogger(PacketDispatcher.class);

    private final PacketParserManager parserManager;
    private final PacketHandlerManager handlerManager;
    private final PacketComposerManager composerManager;

    public PacketDispatcher(
            PacketParserManager parserManager,
            PacketHandlerManager handlerManager,
            PacketComposerManager composerManager) {
        this.parserManager = parserManager;
        this.handlerManager = handlerManager;
        this.composerManager = composerManager;

        LOGGER.info("PacketDispatcher initialized with {} parsers, {} handlers, {} composers",
                parserManager.getParserCount(),
                handlerManager.getHandlerCount(),
                composerManager.getComposerCount());
    }

    /**
     * Processes an incoming client message.
     * <p>
     * Flow: Parse → Handle
     *
     * @param connection the client connection
     * @param message    the raw client message
     * @return true if the message was successfully processed
     */
    public boolean dispatch(NetworkConnection connection, ClientMessage message) {
        int packetId = message.getHeaderId();

        // Parse the message
        Optional<IIncomingPacket> packetOpt = parserManager.parse(connection, message);

        if (packetOpt.isEmpty()) {
            LOGGER.debug("No parser for packet ID {} from {}", packetId, connection.getIpAddress());
            return false;
        }

        // Handle the parsed packet
        IIncomingPacket packet = packetOpt.get();
        boolean handled = handlerManager.handle(connection, packet);

        if (!handled) {
            LOGGER.debug("No handler for {} from {}", packet.getClass().getSimpleName(), connection.getIpAddress());
        }

        return handled;
    }

    /**
     * Composes an outgoing message into a PacketBuffer.
     *
     * @param message the message to compose
     * @return the composed PacketBuffer ready for sending
     */
    public <T extends IOutgoingPacket> PacketBuffer compose(T message) {
        return composerManager.compose(message);
    }

    /**
     * Gets the parser manager.
     */
    public PacketParserManager getParserManager() {
        return parserManager;
    }

    /**
     * Gets the handler manager.
     */
    public PacketHandlerManager getHandlerManager() {
        return handlerManager;
    }

    /**
     * Gets the composer manager.
     */
    public PacketComposerManager getComposerManager() {
        return composerManager;
    }
}
