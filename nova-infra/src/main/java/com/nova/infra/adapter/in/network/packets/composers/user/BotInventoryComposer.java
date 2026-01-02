package com.nova.infra.adapter.in.network.packets.composers.user;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.user.BotInventoryMessage;

/**
 * Composes BotInventory packet for client.
 */
public class BotInventoryComposer extends PacketComposer<BotInventoryMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.USER_BOTS;
    }

    @Override
    protected void write(PacketBuffer packet, BotInventoryMessage message) {
        // No fields to write
    }
}
