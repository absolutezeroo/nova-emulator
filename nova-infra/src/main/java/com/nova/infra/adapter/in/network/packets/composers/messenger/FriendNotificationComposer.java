package com.nova.infra.adapter.in.network.packets.composers.messenger;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.messenger.FriendNotificationMessage;

/**
 * Composes FriendNotification packet for client.
 */
public class FriendNotificationComposer extends PacketComposer<FriendNotificationMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.MESSENGER_FRIEND_NOTIFICATION;
    }

    @Override
    protected void write(PacketBuffer packet, FriendNotificationMessage message) {
        packet.appendInt(message.typeCode());
        packet.appendInt(message.avatarId());
        packet.appendString(message.message());
    }
}
