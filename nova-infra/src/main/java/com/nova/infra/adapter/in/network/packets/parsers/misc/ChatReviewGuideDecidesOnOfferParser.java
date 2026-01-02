package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.ChatReviewGuideDecidesOnOfferMessageEvent;

/**
 * Parses ChatReviewGuideDecidesOnOffer packet from client.
 */
public class ChatReviewGuideDecidesOnOfferParser extends PacketParser<ChatReviewGuideDecidesOnOfferMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.CHAT_REVIEW_GUIDE_DECIDES;
    }

    @Override
    public ChatReviewGuideDecidesOnOfferMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new ChatReviewGuideDecidesOnOfferMessageEvent();
    }
}
