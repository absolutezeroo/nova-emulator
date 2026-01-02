package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.RoomsWithHighestScoreSearchMessageEvent;

/**
 * Parses RoomsWithHighestScoreSearch packet from client.
 */
public class RoomsWithHighestScoreSearchParser extends PacketParser<RoomsWithHighestScoreSearchMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.ROOMS_WITH_HIGHEST_SCORE_SEARCH;
    }

    @Override
    public RoomsWithHighestScoreSearchMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RoomsWithHighestScoreSearchMessageEvent();
    }
}
