package com.nova.infra.adapter.network.packets.parsers.room;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.room.RoomCompetitionInitMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses RoomCompetitionInit packet from client.
 */
@ParsesPacket(Incoming.ROOM_COMPETITION_INIT)
public class RoomCompetitionInitParser extends PacketParser<RoomCompetitionInitMessageEvent> {
@Override
    public RoomCompetitionInitMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RoomCompetitionInitMessageEvent();
    }
}
