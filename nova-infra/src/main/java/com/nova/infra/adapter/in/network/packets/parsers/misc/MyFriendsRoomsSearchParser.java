package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.MyFriendsRoomsSearchMessageEvent;

/**
 * Parses MyFriendsRoomsSearch packet from client.
 */
public class MyFriendsRoomsSearchParser extends PacketParser<MyFriendsRoomsSearchMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.MY_FRIENDS_ROOM_SEARCH;
    }

    @Override
    public MyFriendsRoomsSearchMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new MyFriendsRoomsSearchMessageEvent();
    }
}
