package com.nova.infra.adapter.in.network.packets.parsers.room;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.room.RoomCompetitionInitMessageEvent;

/**
 * Parses RoomCompetitionInit packet from client.
 */
public class RoomCompetitionInitParser extends PacketParser<RoomCompetitionInitMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.ROOM_COMPETITION_INIT;
    }

    @Override
    public RoomCompetitionInitMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RoomCompetitionInitMessageEvent();
    }
}
