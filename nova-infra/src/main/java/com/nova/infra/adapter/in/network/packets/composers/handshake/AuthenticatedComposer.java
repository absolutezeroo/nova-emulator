package com.nova.infra.adapter.in.network.packets.composers.handshake;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.handshake.AuthenticatedMessage;

/**
 * Composes authentication success packets.
 * <p>
 * This is an empty packet - just the header ID indicates success.
 */
public class AuthenticatedComposer extends PacketComposer<AuthenticatedMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.AUTHENTICATED;
    }

    @Override
    protected void write(PacketBuffer packet, AuthenticatedMessage message) {
        // Empty packet - header only
    }
}
