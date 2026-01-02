package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetCategoriesWithUserCountMessageEvent;

/**
 * Parses GetCategoriesWithUserCount packet from client.
 */
public class GetCategoriesWithUserCountParser extends PacketParser<GetCategoriesWithUserCountMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GET_CATEGORIES_WITH_USER_COUNT;
    }

    @Override
    public GetCategoriesWithUserCountMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetCategoriesWithUserCountMessageEvent();
    }
}
