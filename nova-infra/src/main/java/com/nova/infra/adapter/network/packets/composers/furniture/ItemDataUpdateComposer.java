package com.nova.infra.adapter.network.packets.composers.furniture;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.furniture.ItemDataUpdateMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes ItemDataUpdate packet for client.
 */
@ComposesPacket(Outgoing.FURNITURE_ITEMDATA)
public class ItemDataUpdateComposer extends PacketComposer<ItemDataUpdateMessage> {
@Override
    protected void write(PacketBuffer packet, ItemDataUpdateMessage message) {
        packet.appendString(message.data());
    }
}
