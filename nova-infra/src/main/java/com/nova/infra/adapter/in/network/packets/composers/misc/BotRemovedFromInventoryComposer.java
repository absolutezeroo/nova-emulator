package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.BotRemovedFromInventoryMessage;

/**
 * Composes BotRemovedFromInventory packet for client.
 */
public class BotRemovedFromInventoryComposer extends PacketComposer<BotRemovedFromInventoryMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.REMOVE_BOT_FROM_INVENTORY;
    }

    @Override
    protected void write(PacketBuffer packet, BotRemovedFromInventoryMessage message) {
        packet.appendInt(message.itemId());
    }
}
