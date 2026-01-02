package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.ChatReviewSessionCreateMessageEvent;

/**
 * Parses ChatReviewSessionCreate packet from client.
 */
public class ChatReviewSessionCreateParser extends PacketParser<ChatReviewSessionCreateMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.CHAT_REVIEW_SESSION_CREATE;
    }

    @Override
    public ChatReviewSessionCreateMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new ChatReviewSessionCreateMessageEvent();
    }
}
