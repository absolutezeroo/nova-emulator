package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.MyFavouriteRoomsSearchMessageEvent;

/**
 * Parses MyFavouriteRoomsSearch packet from client.
 */
public class MyFavouriteRoomsSearchParser extends PacketParser<MyFavouriteRoomsSearchMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.MY_FAVOURITE_ROOMS_SEARCH;
    }

    @Override
    public MyFavouriteRoomsSearchMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new MyFavouriteRoomsSearchMessageEvent();
    }
}
