package com.nova.infra.adapter.network.packets.parsers.competition;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.competition.CompetitionRoomsSearchMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses CompetitionRoomsSearch packet from client.
 */
@ParsesPacket(Incoming.COMPETITION_ROOM_SEARCH)
public class CompetitionRoomsSearchParser extends PacketParser<CompetitionRoomsSearchMessageEvent> {
@Override
    public CompetitionRoomsSearchMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new CompetitionRoomsSearchMessageEvent();
    }
}
