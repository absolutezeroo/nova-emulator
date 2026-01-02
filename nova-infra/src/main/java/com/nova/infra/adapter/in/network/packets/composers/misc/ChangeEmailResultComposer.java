package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.ChangeEmailResultMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes ChangeEmailResult packet for client.
 */
@ComposesPacket(Outgoing.CHANGE_EMAIL_RESULT)
public class ChangeEmailResultComposer extends PacketComposer<ChangeEmailResultMessage> {
@Override
    protected void write(PacketBuffer packet, ChangeEmailResultMessage message) {
        packet.appendInt(message.result());
    }
}
