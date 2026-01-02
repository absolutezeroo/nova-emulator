package com.nova.infra.adapter.in.network.packets.composers.wired;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.wired.WiredFurniTriggerMessage;

/**
 * Composes WiredFurniTrigger packet for client.
 */
public class WiredFurniTriggerComposer extends PacketComposer<WiredFurniTriggerMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.WIRED_TRIGGER;
    }

    @Override
    protected void write(PacketBuffer packet, WiredFurniTriggerMessage message) {
        // No fields to write
    }
}
