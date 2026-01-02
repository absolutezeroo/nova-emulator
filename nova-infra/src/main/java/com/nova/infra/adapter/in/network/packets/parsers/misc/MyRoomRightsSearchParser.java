package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.MyRoomRightsSearchMessageEvent;

/**
 * Parses MyRoomRightsSearch packet from client.
 */
public class MyRoomRightsSearchParser extends PacketParser<MyRoomRightsSearchMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.MY_ROOM_RIGHTS_SEARCH;
    }

    @Override
    public MyRoomRightsSearchMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new MyRoomRightsSearchMessageEvent();
    }
}
