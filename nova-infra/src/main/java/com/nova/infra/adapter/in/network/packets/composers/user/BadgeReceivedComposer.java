package com.nova.infra.adapter.in.network.packets.composers.user;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.user.BadgeReceivedMessage;

/**
 * Composes BadgeReceived packet for client.
 */
public class BadgeReceivedComposer extends PacketComposer<BadgeReceivedMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.USER_BADGES_ADD;
    }

    @Override
    protected void write(PacketBuffer packet, BadgeReceivedMessage message) {
        packet.appendInt(message.badgeId());
        packet.appendString(message.badgeCode());
    }
}
