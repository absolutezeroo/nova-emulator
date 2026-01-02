package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.SearchFaqsMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses SearchFaqs packet from client.
 */
@ParsesPacket(Incoming.SEARCH_FAQS)
public class SearchFaqsParser extends PacketParser<SearchFaqsMessageEvent> {
@Override
    public SearchFaqsMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new SearchFaqsMessageEvent();
    }
}
