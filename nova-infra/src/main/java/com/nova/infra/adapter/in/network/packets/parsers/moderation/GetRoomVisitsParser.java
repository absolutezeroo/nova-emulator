package com.nova.infra.adapter.in.network.packets.parsers.moderation;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.moderation.GetRoomVisitsMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses GetRoomVisits packet from client.
 */
@ParsesPacket(Incoming.MODTOOL_REQUEST_USER_ROOMS)
public class GetRoomVisitsParser extends PacketParser<GetRoomVisitsMessageEvent> {
@Override
    public GetRoomVisitsMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetRoomVisitsMessageEvent();
    }
}
