package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.WelcomeGiftChangeEmailResultMessage;

/**
 * Composes WelcomeGiftChangeEmailResult packet for client.
 */
public class WelcomeGiftChangeEmailResultComposer extends PacketComposer<WelcomeGiftChangeEmailResultMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.WELCOME_GIFT_CHANGE_EMAIL_RESULT;
    }

    @Override
    protected void write(PacketBuffer packet, WelcomeGiftChangeEmailResultMessage message) {
        packet.appendInt(message.result());
    }
}
