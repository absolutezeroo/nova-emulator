package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.BotRemovedFromInventoryMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes BotRemovedFromInventory packet for client.
 */
@ComposesPacket(Outgoing.REMOVE_BOT_FROM_INVENTORY)
public class BotRemovedFromInventoryComposer extends PacketComposer<BotRemovedFromInventoryMessage> {
@Override
    protected void write(PacketBuffer packet, BotRemovedFromInventoryMessage message) {
        packet.appendInt(message.itemId());
    }
}
