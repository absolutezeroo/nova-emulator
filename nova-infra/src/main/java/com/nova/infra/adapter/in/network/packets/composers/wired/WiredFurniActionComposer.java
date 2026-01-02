package com.nova.infra.adapter.in.network.packets.composers.wired;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.wired.WiredFurniActionMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes WiredFurniAction packet for client.
 */
@ComposesPacket(Outgoing.WIRED_ACTION)
public class WiredFurniActionComposer extends PacketComposer<WiredFurniActionMessage> {
@Override
    protected void write(PacketBuffer packet, WiredFurniActionMessage message) {
        // No fields to write
    }
}
