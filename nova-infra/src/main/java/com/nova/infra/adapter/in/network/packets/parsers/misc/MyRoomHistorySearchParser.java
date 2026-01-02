package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.MyRoomHistorySearchMessageEvent;

/**
 * Parses MyRoomHistorySearch packet from client.
 */
public class MyRoomHistorySearchParser extends PacketParser<MyRoomHistorySearchMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.MY_ROOM_HISTORY_SEARCH;
    }

    @Override
    public MyRoomHistorySearchMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new MyRoomHistorySearchMessageEvent();
    }
}
