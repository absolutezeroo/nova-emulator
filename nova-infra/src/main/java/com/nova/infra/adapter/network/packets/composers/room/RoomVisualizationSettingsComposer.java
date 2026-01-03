package com.nova.infra.adapter.network.packets.composers.room;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.room.RoomVisualizationSettingsMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes RoomVisualizationSettings packet for client.
 */
@ComposesPacket(Outgoing.ROOM_THICKNESS)
public class RoomVisualizationSettingsComposer extends PacketComposer<RoomVisualizationSettingsMessage> {
@Override
    protected void write(PacketBuffer packet, RoomVisualizationSettingsMessage message) {
        packet.appendBoolean(message.hideWalls());
    }
}
