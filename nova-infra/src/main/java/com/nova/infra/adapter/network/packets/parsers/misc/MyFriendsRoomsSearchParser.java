package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.MyFriendsRoomsSearchMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses MyFriendsRoomsSearch packet from client.
 */
@ParsesPacket(Incoming.MY_FRIENDS_ROOM_SEARCH)
public class MyFriendsRoomsSearchParser extends PacketParser<MyFriendsRoomsSearchMessageEvent> {
@Override
    public MyFriendsRoomsSearchMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new MyFriendsRoomsSearchMessageEvent();
    }
}
