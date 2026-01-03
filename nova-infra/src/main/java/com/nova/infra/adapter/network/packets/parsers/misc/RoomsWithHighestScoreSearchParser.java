package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.RoomsWithHighestScoreSearchMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses RoomsWithHighestScoreSearch packet from client.
 */
@ParsesPacket(Incoming.ROOMS_WITH_HIGHEST_SCORE_SEARCH)
public class RoomsWithHighestScoreSearchParser extends PacketParser<RoomsWithHighestScoreSearchMessageEvent> {
@Override
    public RoomsWithHighestScoreSearchMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RoomsWithHighestScoreSearchMessageEvent();
    }
}
