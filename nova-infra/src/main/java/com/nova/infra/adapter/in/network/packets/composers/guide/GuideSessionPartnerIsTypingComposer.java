package com.nova.infra.adapter.in.network.packets.composers.guide;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.guide.GuideSessionPartnerIsTypingMessage;

/**
 * Composes GuideSessionPartnerIsTyping packet for client.
 */
public class GuideSessionPartnerIsTypingComposer extends PacketComposer<GuideSessionPartnerIsTypingMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.GUIDE_SESSION_PARTNER_IS_TYPING;
    }

    @Override
    protected void write(PacketBuffer packet, GuideSessionPartnerIsTypingMessage message) {
        packet.appendBoolean(message.isTyping());
    }
}
