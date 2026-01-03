package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.GenericErrorMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes GenericError packet for client.
 */
@ComposesPacket(Outgoing.GENERIC_ERROR)
public class GenericErrorComposer extends PacketComposer<GenericErrorMessage> {
@Override
    protected void write(PacketBuffer packet, GenericErrorMessage message) {
        packet.appendInt(message.errorCode());
    }
}
