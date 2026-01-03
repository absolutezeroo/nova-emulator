package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.ChatReviewSessionCreateMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses ChatReviewSessionCreate packet from client.
 */
@ParsesPacket(Incoming.CHAT_REVIEW_SESSION_CREATE)
public class ChatReviewSessionCreateParser extends PacketParser<ChatReviewSessionCreateMessageEvent> {
@Override
    public ChatReviewSessionCreateMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new ChatReviewSessionCreateMessageEvent();
    }
}
