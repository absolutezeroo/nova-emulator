package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.ChatReviewGuideDecidesOnOfferMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses ChatReviewGuideDecidesOnOffer packet from client.
 */
@ParsesPacket(Incoming.CHAT_REVIEW_GUIDE_DECIDES)
public class ChatReviewGuideDecidesOnOfferParser extends PacketParser<ChatReviewGuideDecidesOnOfferMessageEvent> {
@Override
    public ChatReviewGuideDecidesOnOfferMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new ChatReviewGuideDecidesOnOfferMessageEvent();
    }
}
