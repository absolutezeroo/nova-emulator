package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.BotRemovedFromInventoryMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

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
