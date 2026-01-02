package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.MyFrequentRoomHistorySearchMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses MyFrequentRoomHistorySearch packet from client.
 */
@ParsesPacket(Incoming.MY_FREQUENT_ROOM_HISTORY_SEARCH)
public class MyFrequentRoomHistorySearchParser extends PacketParser<MyFrequentRoomHistorySearchMessageEvent> {
@Override
    public MyFrequentRoomHistorySearchMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new MyFrequentRoomHistorySearchMessageEvent();
    }
}
