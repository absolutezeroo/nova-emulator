package com.nova.infra.adapter.in.network.packets.parsers.guide;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.guide.GuideSessionIsTypingMessageEvent;

/**
 * Parses GuideSessionIsTyping packet from client.
 */
public class GuideSessionIsTypingParser extends PacketParser<GuideSessionIsTypingMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GUIDE_SESSION_IS_TYPING;
    }

    @Override
    public GuideSessionIsTypingMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GuideSessionIsTypingMessageEvent();
    }
}
