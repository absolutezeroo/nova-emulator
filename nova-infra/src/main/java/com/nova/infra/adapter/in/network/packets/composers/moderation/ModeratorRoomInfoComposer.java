package com.nova.infra.adapter.in.network.packets.composers.moderation;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.moderation.ModeratorRoomInfoMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes ModeratorRoomInfo packet for client.
 */
@ComposesPacket(Outgoing.MODTOOL_ROOM_INFO)
public class ModeratorRoomInfoComposer extends PacketComposer<ModeratorRoomInfoMessage> {
@Override
    protected void write(PacketBuffer packet, ModeratorRoomInfoMessage message) {
        // No fields to write
    }
}
