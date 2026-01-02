package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.WelcomeGiftStatusMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes WelcomeGiftStatus packet for client.
 */
@ComposesPacket(Outgoing.WELCOME_GIFT_STATUS)
public class WelcomeGiftStatusComposer extends PacketComposer<WelcomeGiftStatusMessage> {
@Override
    protected void write(PacketBuffer packet, WelcomeGiftStatusMessage message) {
        packet.appendString(message.email());
        packet.appendBoolean(message.isVerified());
        packet.appendBoolean(message.allowChange());
        packet.appendInt(message.furniId());
        packet.appendBoolean(message.requestedByUser());
    }
}
