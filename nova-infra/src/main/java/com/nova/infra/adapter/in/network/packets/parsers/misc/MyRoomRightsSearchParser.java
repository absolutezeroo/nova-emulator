package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.MyRoomRightsSearchMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses MyRoomRightsSearch packet from client.
 */
@ParsesPacket(Incoming.MY_ROOM_RIGHTS_SEARCH)
public class MyRoomRightsSearchParser extends PacketParser<MyRoomRightsSearchMessageEvent> {
@Override
    public MyRoomRightsSearchMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new MyRoomRightsSearchMessageEvent();
    }
}
