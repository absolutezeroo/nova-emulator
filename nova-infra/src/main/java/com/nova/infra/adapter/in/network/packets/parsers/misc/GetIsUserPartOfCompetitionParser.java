package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetIsUserPartOfCompetitionMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses GetIsUserPartOfCompetition packet from client.
 */
@ParsesPacket(Incoming.GET_IS_USER_PART_OF_COMPETITION)
public class GetIsUserPartOfCompetitionParser extends PacketParser<GetIsUserPartOfCompetitionMessageEvent> {
@Override
    public GetIsUserPartOfCompetitionMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetIsUserPartOfCompetitionMessageEvent();
    }
}
