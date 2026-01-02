package com.nova.infra.adapter.in.network.packets.composers.user;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.user.BadgesMessage;

/**
 * Composes Badges packet for client.
 */
public class BadgesComposer extends PacketComposer<BadgesMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.USER_BADGES;
    }

    @Override
    protected void write(PacketBuffer packet, BadgesMessage message) {
        packet.appendInt(message.userId());
    }
}
