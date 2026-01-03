package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.FurnitureStackHeightMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes FurnitureStackHeight packet for client.
 */
@ComposesPacket(Outgoing.ITEM_STACK_HELPER)
public class FurnitureStackHeightComposer extends PacketComposer<FurnitureStackHeightMessage> {
@Override
    protected void write(PacketBuffer packet, FurnitureStackHeightMessage message) {
        packet.appendInt(message.furniId());
    }
}
