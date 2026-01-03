package com.nova.infra.adapter.network.packets.composers.user;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.user.ChangeUserNameResultMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes ChangeUserNameResult packet for client.
 */
@ComposesPacket(Outgoing.USER_CHANGE_NAME)
public class ChangeUserNameResultComposer extends PacketComposer<ChangeUserNameResultMessage> {
@Override
    protected void write(PacketBuffer packet, ChangeUserNameResultMessage message) {
        packet.appendInt(message.resultCode());
        packet.appendString(message.name());
    }
}
