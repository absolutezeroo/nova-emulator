package com.nova.infra.adapter.in.network.packets.parsers.room;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.room.RoomAdEventTabAdClickedMessageEvent;

/**
 * Parses RoomAdEventTabAdClicked packet from client.
 */
public class RoomAdEventTabAdClickedParser extends PacketParser<RoomAdEventTabAdClickedMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.ROOM_AD_EVENT_TAB_CLICKED;
    }

    @Override
    public RoomAdEventTabAdClickedMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RoomAdEventTabAdClickedMessageEvent();
    }
}
