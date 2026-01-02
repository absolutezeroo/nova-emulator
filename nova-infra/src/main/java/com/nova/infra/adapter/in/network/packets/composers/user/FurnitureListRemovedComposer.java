package com.nova.infra.adapter.in.network.packets.composers.user;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.user.FurnitureListRemovedMessage;

/**
 * Composes FurnitureListRemoved packet for client.
 */
public class FurnitureListRemovedComposer extends PacketComposer<FurnitureListRemovedMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.USER_FURNITURE_REMOVE;
    }

    @Override
    protected void write(PacketBuffer packet, FurnitureListRemovedMessage message) {
        packet.appendInt(message.itemId());
    }
}
