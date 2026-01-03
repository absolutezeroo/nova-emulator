package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.GetCategoriesWithUserCountMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses GetCategoriesWithUserCount packet from client.
 */
@ParsesPacket(Incoming.GET_CATEGORIES_WITH_USER_COUNT)
public class GetCategoriesWithUserCountParser extends PacketParser<GetCategoriesWithUserCountMessageEvent> {
@Override
    public GetCategoriesWithUserCountMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetCategoriesWithUserCountMessageEvent();
    }
}
