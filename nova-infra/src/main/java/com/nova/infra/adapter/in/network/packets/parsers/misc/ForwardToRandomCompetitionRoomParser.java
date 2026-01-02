package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.ForwardToRandomCompetitionRoomMessageEvent;

/**
 * Parses ForwardToRandomCompetitionRoom packet from client.
 */
public class ForwardToRandomCompetitionRoomParser extends PacketParser<ForwardToRandomCompetitionRoomMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.FORWARD_TO_RANDOM_COMPETITION_ROOM;
    }

    @Override
    public ForwardToRandomCompetitionRoomMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new ForwardToRandomCompetitionRoomMessageEvent();
    }
}
