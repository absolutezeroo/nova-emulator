package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.ChangeEmailResultMessage;

/**
 * Composes ChangeEmailResult packet for client.
 */
public class ChangeEmailResultComposer extends PacketComposer<ChangeEmailResultMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.CHANGE_EMAIL_RESULT;
    }

    @Override
    protected void write(PacketBuffer packet, ChangeEmailResultMessage message) {
        packet.appendInt(message.result());
    }
}
