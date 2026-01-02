package com.nova.infra.adapter.in.network.packets.composers.user;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.user.IgnoreResultMessage;

/**
 * Composes IgnoreResult packet for client.
 */
public class IgnoreResultComposer extends PacketComposer<IgnoreResultMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.USER_IGNORED_RESULT;
    }

    @Override
    protected void write(PacketBuffer packet, IgnoreResultMessage message) {
        packet.appendInt(message.result());
        packet.appendString(message.name());
    }
}
