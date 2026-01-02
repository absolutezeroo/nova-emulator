package com.nova.infra.adapter.in.network.packets.composers.unit;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.unit.RoomUnitStatusMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes RoomUnitStatus packet for client.
 */
@ComposesPacket(Outgoing.UNIT_STATUS)
public class RoomUnitStatusComposer extends PacketComposer<RoomUnitStatusMessage> {
@Override
    protected void write(PacketBuffer packet, RoomUnitStatusMessage message) {
        // No fields to write
    }
}
