package com.nova.infra.adapter.in.network.packets.parsers.moderation;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.moderation.GetModeratorRoomInfoMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses GetModeratorRoomInfo packet from client.
 */
@ParsesPacket(Incoming.MODTOOL_REQUEST_ROOM_INFO)
public class GetModeratorRoomInfoParser extends PacketParser<GetModeratorRoomInfoMessageEvent> {
@Override
    public GetModeratorRoomInfoMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetModeratorRoomInfoMessageEvent();
    }
}
