package com.nova.infra.adapter.in.network.packets.parsers.guide;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.guide.GuideSessionIsTypingMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses GuideSessionIsTyping packet from client.
 */
@ParsesPacket(Incoming.GUIDE_SESSION_IS_TYPING)
public class GuideSessionIsTypingParser extends PacketParser<GuideSessionIsTypingMessageEvent> {
@Override
    public GuideSessionIsTypingMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GuideSessionIsTypingMessageEvent();
    }
}
