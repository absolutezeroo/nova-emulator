package com.nova.infra.adapter.network.packets.composers.user;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.user.RespectReceivedMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes RespectReceived packet for client.
 */
@ComposesPacket(Outgoing.USER_RESPECT)
public class RespectReceivedComposer extends PacketComposer<RespectReceivedMessage> {
@Override
    protected void write(PacketBuffer packet, RespectReceivedMessage message) {
        packet.appendInt(message.userId());
        packet.appendInt(message.respectsReceived());
    }
}
