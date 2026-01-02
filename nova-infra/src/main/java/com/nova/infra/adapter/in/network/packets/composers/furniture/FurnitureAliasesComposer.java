package com.nova.infra.adapter.in.network.packets.composers.furniture;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.furniture.FurnitureAliasesMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes FurnitureAliases packet for client.
 */
@ComposesPacket(Outgoing.FURNITURE_ALIASES)
public class FurnitureAliasesComposer extends PacketComposer<FurnitureAliasesMessage> {
@Override
    protected void write(PacketBuffer packet, FurnitureAliasesMessage message) {
        // No fields to write
    }
}
