package com.nova.infra.adapter.in.network.packets.composers.user;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.user.BotInventoryMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes BotInventory packet for client.
 */
@ComposesPacket(Outgoing.USER_BOTS)
public class BotInventoryComposer extends PacketComposer<BotInventoryMessage> {
@Override
    protected void write(PacketBuffer packet, BotInventoryMessage message) {
        // No fields to write
    }
}
