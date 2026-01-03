package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.ForwardToACompetitionRoomMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses ForwardToACompetitionRoom packet from client.
 */
@ParsesPacket(Incoming.FORWARD_TO_A_COMPETITION_ROOM)
public class ForwardToACompetitionRoomParser extends PacketParser<ForwardToACompetitionRoomMessageEvent> {
@Override
    public ForwardToACompetitionRoomMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new ForwardToACompetitionRoomMessageEvent();
    }
}
