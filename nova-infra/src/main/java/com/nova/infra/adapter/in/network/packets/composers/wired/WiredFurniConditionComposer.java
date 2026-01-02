package com.nova.infra.adapter.in.network.packets.composers.wired;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.wired.WiredFurniConditionMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes WiredFurniCondition packet for client.
 */
@ComposesPacket(Outgoing.WIRED_CONDITION)
public class WiredFurniConditionComposer extends PacketComposer<WiredFurniConditionMessage> {
@Override
    protected void write(PacketBuffer packet, WiredFurniConditionMessage message) {
        // No fields to write
    }
}
