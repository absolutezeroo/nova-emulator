package com.nova.infra.adapter.in.network.packets.composers.unit;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.unit.RoomUnitRemoveMessage;

/**
 * Composes RoomUnitRemove packet for client.
 */
public class RoomUnitRemoveComposer extends PacketComposer<RoomUnitRemoveMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.UNIT_REMOVE;
    }

    @Override
    protected void write(PacketBuffer packet, RoomUnitRemoveMessage message) {
        // No fields to write
    }
}
