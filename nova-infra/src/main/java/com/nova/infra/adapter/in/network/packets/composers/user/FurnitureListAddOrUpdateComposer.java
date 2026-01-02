package com.nova.infra.adapter.in.network.packets.composers.user;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.user.FurnitureListAddOrUpdateMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes FurnitureListAddOrUpdate packet for client.
 */
@ComposesPacket(Outgoing.USER_FURNITURE_ADD)
public class FurnitureListAddOrUpdateComposer extends PacketComposer<FurnitureListAddOrUpdateMessage> {
@Override
    protected void write(PacketBuffer packet, FurnitureListAddOrUpdateMessage message) {
        // No fields to write
    }
}
