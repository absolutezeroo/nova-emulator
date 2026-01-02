package com.nova.infra.adapter.in.network.packets.composers.furniture;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.furniture.ItemDataUpdateMessage;

/**
 * Composes ItemDataUpdate packet for client.
 */
public class ItemDataUpdateComposer extends PacketComposer<ItemDataUpdateMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.FURNITURE_ITEMDATA;
    }

    @Override
    protected void write(PacketBuffer packet, ItemDataUpdateMessage message) {
        packet.appendString(message.data());
    }
}
