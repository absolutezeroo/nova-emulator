package com.nova.infra.adapter.in.network.packets.handlers.handshake;

import com.nova.core.domain.port.out.network.NetworkConnection;
import com.nova.infra.adapter.in.network.packets.annotations.HandlesPacket;
import com.nova.infra.adapter.in.network.packets.handlers.PacketHandler;
import com.nova.infra.adapter.in.network.packets.incoming.misc.ClientHelloMessageEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Handles the initial client hello packet.
 * <p>
 * For Nitro/WebSocket clients without encryption, this is just an acknowledgment.
 * No response is needed as modern clients proceed directly to SSO authentication.
 */
@HandlesPacket(ClientHelloMessageEvent.class)
public class ClientHelloHandler implements PacketHandler<ClientHelloMessageEvent> {

    private static final Logger LOGGER = LoggerFactory.getLogger(ClientHelloHandler.class);

    @Override
    public void handle(NetworkConnection connection, ClientHelloMessageEvent packet) {
        LOGGER.debug("Client hello received from {}", connection.getIpAddress());
        // No response needed for Nitro without encryption
        // Client proceeds directly to SSO ticket authentication
    }
}
