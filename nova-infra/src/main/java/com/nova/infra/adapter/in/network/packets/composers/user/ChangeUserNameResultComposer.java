package com.nova.infra.adapter.in.network.packets.composers.user;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.user.ChangeUserNameResultMessage;

/**
 * Composes ChangeUserNameResult packet for client.
 */
public class ChangeUserNameResultComposer extends PacketComposer<ChangeUserNameResultMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.USER_CHANGE_NAME;
    }

    @Override
    protected void write(PacketBuffer packet, ChangeUserNameResultMessage message) {
        packet.appendInt(message.resultCode());
        packet.appendString(message.name());
    }
}
