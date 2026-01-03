package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.MyRoomRightsSearchMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

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
