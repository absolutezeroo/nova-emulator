package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetGuestRoomMessageEvent;

/**
 * Parses GetGuestRoom packet from client.
 */
public class GetGuestRoomParser extends PacketParser<GetGuestRoomMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GET_GUEST_ROOM;
    }

    @Override
    public GetGuestRoomMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetGuestRoomMessageEvent();
    }
}
