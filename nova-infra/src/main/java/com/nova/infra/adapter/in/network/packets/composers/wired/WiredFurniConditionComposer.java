package com.nova.infra.adapter.in.network.packets.composers.wired;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.wired.WiredFurniConditionMessage;

/**
 * Composes WiredFurniCondition packet for client.
 */
public class WiredFurniConditionComposer extends PacketComposer<WiredFurniConditionMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.WIRED_CONDITION;
    }

    @Override
    protected void write(PacketBuffer packet, WiredFurniConditionMessage message) {
        // No fields to write
    }
}
