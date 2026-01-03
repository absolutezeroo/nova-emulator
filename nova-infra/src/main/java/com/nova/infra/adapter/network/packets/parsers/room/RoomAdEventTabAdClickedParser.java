package com.nova.infra.adapter.network.packets.parsers.room;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.room.RoomAdEventTabAdClickedMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses RoomAdEventTabAdClicked packet from client.
 */
@ParsesPacket(Incoming.ROOM_AD_EVENT_TAB_CLICKED)
public class RoomAdEventTabAdClickedParser extends PacketParser<RoomAdEventTabAdClickedMessageEvent> {
@Override
    public RoomAdEventTabAdClickedMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RoomAdEventTabAdClickedMessageEvent();
    }
}
