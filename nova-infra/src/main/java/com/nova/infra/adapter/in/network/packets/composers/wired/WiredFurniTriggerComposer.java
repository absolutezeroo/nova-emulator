package com.nova.infra.adapter.in.network.packets.composers.wired;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.wired.WiredFurniTriggerMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes WiredFurniTrigger packet for client.
 */
@ComposesPacket(Outgoing.WIRED_TRIGGER)
public class WiredFurniTriggerComposer extends PacketComposer<WiredFurniTriggerMessage> {
@Override
    protected void write(PacketBuffer packet, WiredFurniTriggerMessage message) {
        // No fields to write
    }
}
