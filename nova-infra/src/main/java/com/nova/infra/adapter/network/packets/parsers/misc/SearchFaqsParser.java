package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.SearchFaqsMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

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
