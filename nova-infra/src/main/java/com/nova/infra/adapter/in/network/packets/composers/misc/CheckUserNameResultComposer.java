package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.CheckUserNameResultMessage;

/**
 * Composes CheckUserNameResult packet for client.
 */
public class CheckUserNameResultComposer extends PacketComposer<CheckUserNameResultMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.CHECK_USER_NAME;
    }

    @Override
    protected void write(PacketBuffer packet, CheckUserNameResultMessage message) {
        packet.appendInt(message.resultCode());
        packet.appendString(message.name());
    }
}
