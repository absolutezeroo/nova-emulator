package com.nova.infra.adapter.in.network.packets.composers.room;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.room.RoomMessageNotificationMessage;

/**
 * Composes RoomMessageNotification packet for client.
 */
public class RoomMessageNotificationComposer extends PacketComposer<RoomMessageNotificationMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.ROOM_MESSAGE_NOTIFICATION;
    }

    @Override
    protected void write(PacketBuffer packet, RoomMessageNotificationMessage message) {
        packet.appendInt(message.roomId());
        packet.appendString(message.roomName());
        packet.appendInt(message.messageCount());
    }
}
