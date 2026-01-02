package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.MyRecommendedRoomsMessageEvent;

/**
 * Parses MyRecommendedRooms packet from client.
 */
public class MyRecommendedRoomsParser extends PacketParser<MyRecommendedRoomsMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.MY_RECOMMENDED_ROOMS;
    }

    @Override
    public MyRecommendedRoomsMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new MyRecommendedRoomsMessageEvent();
    }
}
