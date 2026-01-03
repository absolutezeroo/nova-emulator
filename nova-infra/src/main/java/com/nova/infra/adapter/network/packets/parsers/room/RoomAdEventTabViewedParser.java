package com.nova.infra.adapter.network.packets.parsers.room;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.room.RoomAdEventTabViewedMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses RoomAdEventTabViewed packet from client.
 */
@ParsesPacket(Incoming.ROOM_AD_EVENT_TAB_VIEWED)
public class RoomAdEventTabViewedParser extends PacketParser<RoomAdEventTabViewedMessageEvent> {
@Override
    public RoomAdEventTabViewedMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RoomAdEventTabViewedMessageEvent();
    }
}
