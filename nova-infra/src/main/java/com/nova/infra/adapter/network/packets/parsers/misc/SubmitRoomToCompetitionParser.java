package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.SubmitRoomToCompetitionMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses SubmitRoomToCompetition packet from client.
 */
@ParsesPacket(Incoming.SUBMIT_ROOM_TO_COMPETITION)
public class SubmitRoomToCompetitionParser extends PacketParser<SubmitRoomToCompetitionMessageEvent> {
@Override
    public SubmitRoomToCompetitionMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new SubmitRoomToCompetitionMessageEvent();
    }
}
