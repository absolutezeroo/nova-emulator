package com.nova.infra.adapter.network.packets.composers.user;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.user.FurnitureListMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes FurnitureList packet for client.
 */
@ComposesPacket(Outgoing.USER_FURNITURE)
public class FurnitureListComposer extends PacketComposer<FurnitureListMessage> {
@Override
    protected void write(PacketBuffer packet, FurnitureListMessage message) {
        packet.appendInt(message.itemId());
        packet.appendString(message.furniType());
        packet.appendInt(message.ref());
        packet.appendInt(message.spriteId());
        packet.appendInt(message.category());
        packet.appendBoolean(message.isRecyclable());
        packet.appendBoolean(message.tradable());
        packet.appendBoolean(message.isGroupable());
        packet.appendBoolean(message.sellable());
        packet.appendInt(message.secondsToExpiration());
    }
}
