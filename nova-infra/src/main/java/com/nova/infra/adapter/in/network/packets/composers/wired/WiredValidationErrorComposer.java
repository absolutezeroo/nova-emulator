package com.nova.infra.adapter.in.network.packets.composers.wired;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.wired.WiredValidationErrorMessage;

/**
 * Composes WiredValidationError packet for client.
 */
public class WiredValidationErrorComposer extends PacketComposer<WiredValidationErrorMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.WIRED_ERROR;
    }

    @Override
    protected void write(PacketBuffer packet, WiredValidationErrorMessage message) {
        packet.appendString(message.info());
    }
}
