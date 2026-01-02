package com.nova.infra.adapter.in.network.packets.composers.user;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.user.BadgesMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes Badges packet for client.
 */
@ComposesPacket(Outgoing.USER_BADGES)
public class BadgesComposer extends PacketComposer<BadgesMessage> {
@Override
    protected void write(PacketBuffer packet, BadgesMessage message) {
        packet.appendInt(message.userId());
    }
}
