package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.PopularRoomsSearchMessageEvent;

/**
 * Parses PopularRoomsSearch packet from client.
 */
public class PopularRoomsSearchParser extends PacketParser<PopularRoomsSearchMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.POPULAR_ROOMS_SEARCH;
    }

    @Override
    public PopularRoomsSearchMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new PopularRoomsSearchMessageEvent();
    }
}
