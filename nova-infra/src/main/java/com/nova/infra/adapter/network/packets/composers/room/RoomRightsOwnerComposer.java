package com.nova.infra.adapter.network.packets.composers.room;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.room.RoomRightsOwnerMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes RoomRightsOwner packet for client.
 */
@ComposesPacket(Outgoing.ROOM_RIGHTS_OWNER)
public class RoomRightsOwnerComposer extends PacketComposer<RoomRightsOwnerMessage> {
@Override
    protected void write(PacketBuffer packet, RoomRightsOwnerMessage message) {
        // No fields to write
    }
}
