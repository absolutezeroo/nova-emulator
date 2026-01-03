package com.nova.infra.adapter.network.packets.composers.user;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.user.BadgeReceivedMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes BadgeReceived packet for client.
 */
@ComposesPacket(Outgoing.USER_BADGES_ADD)
public class BadgeReceivedComposer extends PacketComposer<BadgeReceivedMessage> {
@Override
    protected void write(PacketBuffer packet, BadgeReceivedMessage message) {
        packet.appendInt(message.badgeId());
        packet.appendString(message.badgeCode());
    }
}
