package com.nova.infra.adapter.in.network.packets.composers.unit;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.unit.RoomUnitRemoveMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes RoomUnitRemove packet for client.
 */
@ComposesPacket(Outgoing.UNIT_REMOVE)
public class RoomUnitRemoveComposer extends PacketComposer<RoomUnitRemoveMessage> {
@Override
    protected void write(PacketBuffer packet, RoomUnitRemoveMessage message) {
        // No fields to write
    }
}
