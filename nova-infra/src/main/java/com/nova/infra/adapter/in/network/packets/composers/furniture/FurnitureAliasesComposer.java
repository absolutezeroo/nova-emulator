package com.nova.infra.adapter.in.network.packets.composers.furniture;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.furniture.FurnitureAliasesMessage;

/**
 * Composes FurnitureAliases packet for client.
 */
public class FurnitureAliasesComposer extends PacketComposer<FurnitureAliasesMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.FURNITURE_ALIASES;
    }

    @Override
    protected void write(PacketBuffer packet, FurnitureAliasesMessage message) {
        // No fields to write
    }
}
