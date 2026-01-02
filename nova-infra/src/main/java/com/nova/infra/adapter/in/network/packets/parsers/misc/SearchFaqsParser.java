package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.SearchFaqsMessageEvent;

/**
 * Parses SearchFaqs packet from client.
 */
public class SearchFaqsParser extends PacketParser<SearchFaqsMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.SEARCH_FAQS;
    }

    @Override
    public SearchFaqsMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new SearchFaqsMessageEvent();
    }
}
