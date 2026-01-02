package com.nova.infra.adapter.in.network.packets.parsers.moderation;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.moderation.GetRoomVisitsMessageEvent;

/**
 * Parses GetRoomVisits packet from client.
 */
public class GetRoomVisitsParser extends PacketParser<GetRoomVisitsMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.MODTOOL_REQUEST_USER_ROOMS;
    }

    @Override
    public GetRoomVisitsMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetRoomVisitsMessageEvent();
    }
}
