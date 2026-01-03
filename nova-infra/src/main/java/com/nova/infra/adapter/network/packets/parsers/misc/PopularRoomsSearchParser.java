package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.PopularRoomsSearchMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses PopularRoomsSearch packet from client.
 */
@ParsesPacket(Incoming.POPULAR_ROOMS_SEARCH)
public class PopularRoomsSearchParser extends PacketParser<PopularRoomsSearchMessageEvent> {
@Override
    public PopularRoomsSearchMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new PopularRoomsSearchMessageEvent();
    }
}
