package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.ChatReviewGuideDetachedMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses ChatReviewGuideDetached packet from client.
 */
@ParsesPacket(Incoming.CHAT_REVIEW_GUIDE_DETACHED)
public class ChatReviewGuideDetachedParser extends PacketParser<ChatReviewGuideDetachedMessageEvent> {
@Override
    public ChatReviewGuideDetachedMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new ChatReviewGuideDetachedMessageEvent();
    }
}
