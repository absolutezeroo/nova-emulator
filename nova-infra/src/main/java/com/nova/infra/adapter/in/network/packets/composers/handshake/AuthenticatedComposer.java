package com.nova.infra.adapter.in.network.packets.composers.handshake;

import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;
import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.handshake.AuthenticatedMessage;

/**
 * Composes Authenticated packet for client.
 */
@ComposesPacket(Outgoing.AUTHENTICATED)
public class AuthenticatedComposer extends PacketComposer<AuthenticatedMessage> {

    @Override
    protected void write(PacketBuffer packet, AuthenticatedMessage message) {
        // No fields to write
    }
}
