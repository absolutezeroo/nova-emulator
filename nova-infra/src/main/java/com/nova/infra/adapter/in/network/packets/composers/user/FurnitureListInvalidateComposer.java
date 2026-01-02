package com.nova.infra.adapter.in.network.packets.composers.user;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.user.FurnitureListInvalidateMessage;

/**
 * Composes FurnitureListInvalidate packet for client.
 */
public class FurnitureListInvalidateComposer extends PacketComposer<FurnitureListInvalidateMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.USER_FURNITURE_REFRESH;
    }

    @Override
    protected void write(PacketBuffer packet, FurnitureListInvalidateMessage message) {
        // No fields to write
    }
}
