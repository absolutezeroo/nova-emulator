package com.nova.infra.adapter.in.network.packets.composers.wired;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.wired.WiredFurniActionMessage;

/**
 * Composes WiredFurniAction packet for client.
 */
public class WiredFurniActionComposer extends PacketComposer<WiredFurniActionMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.WIRED_ACTION;
    }

    @Override
    protected void write(PacketBuffer packet, WiredFurniActionMessage message) {
        // No fields to write
    }
}
