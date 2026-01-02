package com.nova.infra.adapter.in.network.packets.parsers.moderation;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.moderation.GetModeratorRoomInfoMessageEvent;

/**
 * Parses GetModeratorRoomInfo packet from client.
 */
public class GetModeratorRoomInfoParser extends PacketParser<GetModeratorRoomInfoMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.MODTOOL_REQUEST_ROOM_INFO;
    }

    @Override
    public GetModeratorRoomInfoMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetModeratorRoomInfoMessageEvent();
    }
}
