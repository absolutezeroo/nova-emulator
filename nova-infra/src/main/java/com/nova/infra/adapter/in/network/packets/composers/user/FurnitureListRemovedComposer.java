package com.nova.infra.adapter.in.network.packets.composers.user;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.user.FurnitureListRemovedMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes FurnitureListRemoved packet for client.
 */
@ComposesPacket(Outgoing.USER_FURNITURE_REMOVE)
public class FurnitureListRemovedComposer extends PacketComposer<FurnitureListRemovedMessage> {
@Override
    protected void write(PacketBuffer packet, FurnitureListRemovedMessage message) {
        packet.appendInt(message.itemId());
    }
}
