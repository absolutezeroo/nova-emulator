package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.FurnitureStackHeightMessage;

/**
 * Composes FurnitureStackHeight packet for client.
 */
public class FurnitureStackHeightComposer extends PacketComposer<FurnitureStackHeightMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.ITEM_STACK_HELPER;
    }

    @Override
    protected void write(PacketBuffer packet, FurnitureStackHeightMessage message) {
        packet.appendInt(message.furniId());
    }
}
