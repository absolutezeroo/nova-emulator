package com.nova.infra.adapter.in.network.packets.composers.unit;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.unit.RoomUnitStatusMessage;

/**
 * Composes RoomUnitStatus packet for client.
 */
public class RoomUnitStatusComposer extends PacketComposer<RoomUnitStatusMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.UNIT_STATUS;
    }

    @Override
    protected void write(PacketBuffer packet, RoomUnitStatusMessage message) {
        // No fields to write
    }
}
