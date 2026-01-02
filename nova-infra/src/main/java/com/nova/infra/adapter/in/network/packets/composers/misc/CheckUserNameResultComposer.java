package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.CheckUserNameResultMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes CheckUserNameResult packet for client.
 */
@ComposesPacket(Outgoing.CHECK_USER_NAME)
public class CheckUserNameResultComposer extends PacketComposer<CheckUserNameResultMessage> {
@Override
    protected void write(PacketBuffer packet, CheckUserNameResultMessage message) {
        packet.appendInt(message.resultCode());
        packet.appendString(message.name());
    }
}
