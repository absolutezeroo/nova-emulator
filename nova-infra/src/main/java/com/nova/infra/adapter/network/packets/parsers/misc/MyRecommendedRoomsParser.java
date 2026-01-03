package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.MyRecommendedRoomsMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses MyRecommendedRooms packet from client.
 */
@ParsesPacket(Incoming.MY_RECOMMENDED_ROOMS)
public class MyRecommendedRoomsParser extends PacketParser<MyRecommendedRoomsMessageEvent> {
@Override
    public MyRecommendedRoomsMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new MyRecommendedRoomsMessageEvent();
    }
}
