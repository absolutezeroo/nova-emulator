package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.MyRoomsSearchMessageEvent;

/**
 * Parses MyRoomsSearch packet from client.
 */
public class MyRoomsSearchParser extends PacketParser<MyRoomsSearchMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.MY_ROOMS_SEARCH;
    }

    @Override
    public MyRoomsSearchMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new MyRoomsSearchMessageEvent();
    }
}
