package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.ForwardToACompetitionRoomMessageEvent;

/**
 * Parses ForwardToACompetitionRoom packet from client.
 */
public class ForwardToACompetitionRoomParser extends PacketParser<ForwardToACompetitionRoomMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.FORWARD_TO_A_COMPETITION_ROOM;
    }

    @Override
    public ForwardToACompetitionRoomMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new ForwardToACompetitionRoomMessageEvent();
    }
}
