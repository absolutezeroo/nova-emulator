package com.nova.infra.adapter.in.network.packets.composers.messenger;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.messenger.FriendNotificationMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes FriendNotification packet for client.
 */
@ComposesPacket(Outgoing.MESSENGER_FRIEND_NOTIFICATION)
public class FriendNotificationComposer extends PacketComposer<FriendNotificationMessage> {
@Override
    protected void write(PacketBuffer packet, FriendNotificationMessage message) {
        packet.appendInt(message.typeCode());
        packet.appendInt(message.avatarId());
        packet.appendString(message.message());
    }
}
