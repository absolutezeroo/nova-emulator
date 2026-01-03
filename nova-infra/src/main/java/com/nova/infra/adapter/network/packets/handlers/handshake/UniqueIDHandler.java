package com.nova.infra.adapter.network.packets.handlers.handshake;

import com.nova.core.domain.gateway.NetworkConnection;
import com.nova.infra.adapter.network.packets.annotations.HandlesPacket;
import com.nova.infra.adapter.network.packets.composers.PacketComposerManager;
import com.nova.infra.adapter.network.packets.handlers.PacketHandler;
import com.nova.infra.adapter.network.packets.incoming.misc.UniqueIDMessageEvent;
import com.nova.infra.adapter.network.packets.outgoing.misc.UniqueMachineIDMessage;
import jakarta.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.security.SecureRandom;

/**
 * Handles machine ID / unique identifier packets from client.
 * <p>
 * Stores the machine ID for session tracking and anti-cheat purposes.
 * If the client sends an invalid machine ID, generates a new one.
 */
@HandlesPacket(UniqueIDMessageEvent.class)
public class UniqueIDHandler implements PacketHandler<UniqueIDMessageEvent> {

    private static final Logger LOGGER = LoggerFactory.getLogger(UniqueIDHandler.class);
    private static final int MACHINE_ID_LENGTH = 64;
    private static final SecureRandom RANDOM = new SecureRandom();

    private final PacketComposerManager composerManager;

    @Inject
    public UniqueIDHandler(PacketComposerManager composerManager) {
        this.composerManager = composerManager;
    }

    @Override
    public void handle(NetworkConnection connection, UniqueIDMessageEvent packet) {
        String machineId = packet.machineId();

        // Validate machine ID format
        if (machineId == null || machineId.startsWith("~") || machineId.length() != MACHINE_ID_LENGTH) {
            // Generate new machine ID
            machineId = generateMachineId();
            connection.send(composerManager.compose(new UniqueMachineIDMessage(machineId)).getBuffer());
            LOGGER.debug("Generated new machine ID for {}", connection.getIpAddress());
        }

        // Store machine info in connection for later use (anti-cheat, session tracking)
        connection.setAttribute("machineId", machineId);
        connection.setAttribute("fingerprint", packet.fingerprint());
        connection.setAttribute("flashVersion", packet.flashVersion());

        LOGGER.debug("Machine ID received from {}: {}... (fingerprint: {}, version: {})",
                connection.getIpAddress(),
                machineId.substring(0, Math.min(8, machineId.length())),
                packet.fingerprint(),
                packet.flashVersion());
    }

    private String generateMachineId() {
        StringBuilder sb = new StringBuilder(MACHINE_ID_LENGTH);
        String chars = "0123456789abcdef";

        for (int i = 0; i < MACHINE_ID_LENGTH; i++) {
            sb.append(chars.charAt(RANDOM.nextInt(chars.length())));
        }

        return sb.toString();
    }
}
