package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.ChatReviewGuideDetachedMessageEvent;

/**
 * Parses ChatReviewGuideDetached packet from client.
 */
public class ChatReviewGuideDetachedParser extends PacketParser<ChatReviewGuideDetachedMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.CHAT_REVIEW_GUIDE_DETACHED;
    }

    @Override
    public ChatReviewGuideDetachedMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new ChatReviewGuideDetachedMessageEvent();
    }
}
