package com.nova.infra.adapter.in.network.packets.parsers.room;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.room.RoomAdEventTabViewedMessageEvent;

/**
 * Parses RoomAdEventTabViewed packet from client.
 */
public class RoomAdEventTabViewedParser extends PacketParser<RoomAdEventTabViewedMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.ROOM_AD_EVENT_TAB_VIEWED;
    }

    @Override
    public RoomAdEventTabViewedMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RoomAdEventTabViewedMessageEvent();
    }
}
