package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.GetFaqCategoryMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses GetFaqCategory packet from client.
 */
@ParsesPacket(Incoming.GET_FAQ_CATEGORY)
public class GetFaqCategoryParser extends PacketParser<GetFaqCategoryMessageEvent> {
@Override
    public GetFaqCategoryMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetFaqCategoryMessageEvent();
    }
}
