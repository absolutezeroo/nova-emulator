package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.ForwardToRandomCompetitionRoomMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses ForwardToRandomCompetitionRoom packet from client.
 */
@ParsesPacket(Incoming.FORWARD_TO_RANDOM_COMPETITION_ROOM)
public class ForwardToRandomCompetitionRoomParser extends PacketParser<ForwardToRandomCompetitionRoomMessageEvent> {
@Override
    public ForwardToRandomCompetitionRoomMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new ForwardToRandomCompetitionRoomMessageEvent();
    }
}
