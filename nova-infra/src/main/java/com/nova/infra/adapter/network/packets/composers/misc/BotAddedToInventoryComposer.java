package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.BotAddedToInventoryMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes BotAddedToInventory packet for client.
 */
@ComposesPacket(Outgoing.ADD_BOT_TO_INVENTORY)
public class BotAddedToInventoryComposer extends PacketComposer<BotAddedToInventoryMessage> {
@Override
    protected void write(PacketBuffer packet, BotAddedToInventoryMessage message) {
        packet.appendBoolean(message.openInventory());
    }
}
