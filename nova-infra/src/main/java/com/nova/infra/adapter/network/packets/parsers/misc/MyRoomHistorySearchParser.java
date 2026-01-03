package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.MyRoomHistorySearchMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses MyRoomHistorySearch packet from client.
 */
@ParsesPacket(Incoming.MY_ROOM_HISTORY_SEARCH)
public class MyRoomHistorySearchParser extends PacketParser<MyRoomHistorySearchMessageEvent> {
@Override
    public MyRoomHistorySearchMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new MyRoomHistorySearchMessageEvent();
    }
}
