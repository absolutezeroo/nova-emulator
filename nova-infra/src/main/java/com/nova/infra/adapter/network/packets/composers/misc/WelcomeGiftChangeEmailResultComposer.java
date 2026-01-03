package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.WelcomeGiftChangeEmailResultMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes WelcomeGiftChangeEmailResult packet for client.
 */
@ComposesPacket(Outgoing.WELCOME_GIFT_CHANGE_EMAIL_RESULT)
public class WelcomeGiftChangeEmailResultComposer extends PacketComposer<WelcomeGiftChangeEmailResultMessage> {
@Override
    protected void write(PacketBuffer packet, WelcomeGiftChangeEmailResultMessage message) {
        packet.appendInt(message.result());
    }
}
