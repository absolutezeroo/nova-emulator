package com.nova.infra.adapter.in.network.packets.composers.guide;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.guide.GuideSessionPartnerIsTypingMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes GuideSessionPartnerIsTyping packet for client.
 */
@ComposesPacket(Outgoing.GUIDE_SESSION_PARTNER_IS_TYPING)
public class GuideSessionPartnerIsTypingComposer extends PacketComposer<GuideSessionPartnerIsTypingMessage> {
@Override
    protected void write(PacketBuffer packet, GuideSessionPartnerIsTypingMessage message) {
        packet.appendBoolean(message.isTyping());
    }
}
