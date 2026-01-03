package com.nova.infra.adapter.network.packets.composers.user;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.user.FurnitureListInvalidateMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes FurnitureListInvalidate packet for client.
 */
@ComposesPacket(Outgoing.USER_FURNITURE_REFRESH)
public class FurnitureListInvalidateComposer extends PacketComposer<FurnitureListInvalidateMessage> {
@Override
    protected void write(PacketBuffer packet, FurnitureListInvalidateMessage message) {
        // No fields to write
    }
}
