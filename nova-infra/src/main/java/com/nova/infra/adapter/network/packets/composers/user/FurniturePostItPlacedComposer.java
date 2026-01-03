package com.nova.infra.adapter.network.packets.composers.user;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.user.FurniturePostItPlacedMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

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
