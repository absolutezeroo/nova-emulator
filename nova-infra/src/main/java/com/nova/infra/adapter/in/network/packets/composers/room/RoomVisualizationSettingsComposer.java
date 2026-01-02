package com.nova.infra.adapter.in.network.packets.composers.room;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.room.RoomVisualizationSettingsMessage;

/**
 * Composes RoomVisualizationSettings packet for client.
 */
public class RoomVisualizationSettingsComposer extends PacketComposer<RoomVisualizationSettingsMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.ROOM_THICKNESS;
    }

    @Override
    protected void write(PacketBuffer packet, RoomVisualizationSettingsMessage message) {
        packet.appendBoolean(message.hideWalls());
    }
}
