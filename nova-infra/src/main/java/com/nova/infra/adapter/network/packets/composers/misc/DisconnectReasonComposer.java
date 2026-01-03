package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.DisconnectReasonMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes DisconnectReason packet for client.
 */
@ComposesPacket(Outgoing.DISCONNECT_REASON)
public class DisconnectReasonComposer extends PacketComposer<DisconnectReasonMessage> {
@Override
    protected void write(PacketBuffer packet, DisconnectReasonMessage message) {
        packet.appendInt(message.reason());
    }
}
