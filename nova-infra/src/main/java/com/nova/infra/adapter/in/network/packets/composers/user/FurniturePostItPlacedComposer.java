package com.nova.infra.adapter.in.network.packets.composers.user;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.user.FurniturePostItPlacedMessage;

/**
 * Composes FurniturePostItPlaced packet for client.
 */
public class FurniturePostItPlacedComposer extends PacketComposer<FurniturePostItPlacedMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.USER_FURNITURE_POSTIT_PLACED;
    }

    @Override
    protected void write(PacketBuffer packet, FurniturePostItPlacedMessage message) {
        packet.appendInt(message.itemId());
        packet.appendInt(message.itemsLeft());
    }
}
