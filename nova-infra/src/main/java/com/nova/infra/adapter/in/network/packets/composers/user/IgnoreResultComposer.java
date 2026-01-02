package com.nova.infra.adapter.in.network.packets.composers.user;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.user.IgnoreResultMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes IgnoreResult packet for client.
 */
@ComposesPacket(Outgoing.USER_IGNORED_RESULT)
public class IgnoreResultComposer extends PacketComposer<IgnoreResultMessage> {
@Override
    protected void write(PacketBuffer packet, IgnoreResultMessage message) {
        packet.appendInt(message.result());
        packet.appendString(message.name());
    }
}
