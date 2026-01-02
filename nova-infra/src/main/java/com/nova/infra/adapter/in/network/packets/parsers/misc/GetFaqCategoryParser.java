package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetFaqCategoryMessageEvent;

/**
 * Parses GetFaqCategory packet from client.
 */
public class GetFaqCategoryParser extends PacketParser<GetFaqCategoryMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GET_FAQ_CATEGORY;
    }

    @Override
    public GetFaqCategoryMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetFaqCategoryMessageEvent();
    }
}
