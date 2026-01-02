package com.nova.infra.adapter.in.network.packets.composers.user;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.user.RespectReceivedMessage;

/**
 * Composes RespectReceived packet for client.
 */
public class RespectReceivedComposer extends PacketComposer<RespectReceivedMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.USER_RESPECT;
    }

    @Override
    protected void write(PacketBuffer packet, RespectReceivedMessage message) {
        packet.appendInt(message.userId());
        packet.appendInt(message.respectsReceived());
    }
}
