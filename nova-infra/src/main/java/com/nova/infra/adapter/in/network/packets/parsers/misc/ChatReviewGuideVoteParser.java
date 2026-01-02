package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.ChatReviewGuideVoteMessageEvent;

/**
 * Parses ChatReviewGuideVote packet from client.
 */
public class ChatReviewGuideVoteParser extends PacketParser<ChatReviewGuideVoteMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.CHAT_REVIEW_GUIDE_VOTE;
    }

    @Override
    public ChatReviewGuideVoteMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new ChatReviewGuideVoteMessageEvent();
    }
}
