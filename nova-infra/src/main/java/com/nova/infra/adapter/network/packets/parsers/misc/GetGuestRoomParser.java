package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.GetGuestRoomMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses GetGuestRoom packet from client.
 */
@ParsesPacket(Incoming.GET_GUEST_ROOM)
public class GetGuestRoomParser extends PacketParser<GetGuestRoomMessageEvent> {
@Override
    public GetGuestRoomMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetGuestRoomMessageEvent();
    }
}
