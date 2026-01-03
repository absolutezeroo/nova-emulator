package com.nova.infra.adapter.network.packets.composers.wired;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.wired.WiredValidationErrorMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes WiredValidationError packet for client.
 */
@ComposesPacket(Outgoing.WIRED_ERROR)
public class WiredValidationErrorComposer extends PacketComposer<WiredValidationErrorMessage> {
@Override
    protected void write(PacketBuffer packet, WiredValidationErrorMessage message) {
        packet.appendString(message.info());
    }
}
