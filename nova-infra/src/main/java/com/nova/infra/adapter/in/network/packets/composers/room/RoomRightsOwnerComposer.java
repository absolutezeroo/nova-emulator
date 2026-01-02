package com.nova.infra.adapter.in.network.packets.composers.room;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.room.RoomRightsOwnerMessage;

/**
 * Composes RoomRightsOwner packet for client.
 */
public class RoomRightsOwnerComposer extends PacketComposer<RoomRightsOwnerMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.ROOM_RIGHTS_OWNER;
    }

    @Override
    protected void write(PacketBuffer packet, RoomRightsOwnerMessage message) {
        // No fields to write
    }
}
