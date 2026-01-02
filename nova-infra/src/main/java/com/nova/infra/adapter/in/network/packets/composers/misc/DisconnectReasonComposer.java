package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.DisconnectReasonMessage;

/**
 * Composes DisconnectReason packet for client.
 */
public class DisconnectReasonComposer extends PacketComposer<DisconnectReasonMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.DISCONNECT_REASON;
    }

    @Override
    protected void write(PacketBuffer packet, DisconnectReasonMessage message) {
        packet.appendInt(message.reason());
    }
}
