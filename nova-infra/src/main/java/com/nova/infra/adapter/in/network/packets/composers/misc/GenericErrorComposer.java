package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.GenericErrorMessage;

/**
 * Composes GenericError packet for client.
 */
public class GenericErrorComposer extends PacketComposer<GenericErrorMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.GENERIC_ERROR;
    }

    @Override
    protected void write(PacketBuffer packet, GenericErrorMessage message) {
        packet.appendInt(message.errorCode());
    }
}
