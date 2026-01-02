package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetOfficialRoomsMessageEvent;

/**
 * Parses GetOfficialRooms packet from client.
 */
public class GetOfficialRoomsParser extends PacketParser<GetOfficialRoomsMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GET_OFFICIAL_ROOMS;
    }

    @Override
    public GetOfficialRoomsMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetOfficialRoomsMessageEvent();
    }
}
