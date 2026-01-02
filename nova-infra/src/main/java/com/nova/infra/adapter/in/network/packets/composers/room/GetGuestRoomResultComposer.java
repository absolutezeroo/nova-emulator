package com.nova.infra.adapter.in.network.packets.composers.room;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.room.GetGuestRoomResultMessage;

/**
 * Composes GetGuestRoomResult packet for client.
 */
public class GetGuestRoomResultComposer extends PacketComposer<GetGuestRoomResultMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.ROOM_INFO;
    }

    @Override
    protected void write(PacketBuffer packet, GetGuestRoomResultMessage message) {
        packet.appendBoolean(message.roomEnter());
        packet.appendBoolean(message.roomForward());
        packet.appendBoolean(message.staffPick());
        packet.appendBoolean(message.isGroupMember());
    }
}
