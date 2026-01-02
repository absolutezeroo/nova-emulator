package com.nova.infra.adapter.in.network.packets.composers.user;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.user.FurnitureListAddOrUpdateMessage;

/**
 * Composes FurnitureListAddOrUpdate packet for client.
 */
public class FurnitureListAddOrUpdateComposer extends PacketComposer<FurnitureListAddOrUpdateMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.USER_FURNITURE_ADD;
    }

    @Override
    protected void write(PacketBuffer packet, FurnitureListAddOrUpdateMessage message) {
        // No fields to write
    }
}
