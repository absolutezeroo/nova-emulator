package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetPromoArticlesMessageEvent;

/**
 * Parses GetPromoArticles packet from client.
 */
public class GetPromoArticlesParser extends PacketParser<GetPromoArticlesMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GET_PROMO_ARTICLES;
    }

    @Override
    public GetPromoArticlesMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetPromoArticlesMessageEvent();
    }
}
