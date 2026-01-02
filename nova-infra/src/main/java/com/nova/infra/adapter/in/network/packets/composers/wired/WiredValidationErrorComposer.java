package com.nova.infra.adapter.in.network.packets.composers.wired;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.wired.WiredValidationErrorMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

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
