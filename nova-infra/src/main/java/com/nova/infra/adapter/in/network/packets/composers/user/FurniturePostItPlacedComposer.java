package com.nova.infra.adapter.in.network.packets.composers.user;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.user.FurniturePostItPlacedMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes FurniturePostItPlaced packet for client.
 */
@ComposesPacket(Outgoing.USER_FURNITURE_POSTIT_PLACED)
public class FurniturePostItPlacedComposer extends PacketComposer<FurniturePostItPlacedMessage> {
@Override
    protected void write(PacketBuffer packet, FurniturePostItPlacedMessage message) {
        packet.appendInt(message.itemId());
        packet.appendInt(message.itemsLeft());
    }
}
