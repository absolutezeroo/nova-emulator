package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetWeeklyGameRewardWinnersMessageEvent;

/**
 * Parses GetWeeklyGameRewardWinners packet from client.
 */
public class GetWeeklyGameRewardWinnersParser extends PacketParser<GetWeeklyGameRewardWinnersMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GETWEEKLYGAMEREWARDWINNERS;
    }

    @Override
    public GetWeeklyGameRewardWinnersMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetWeeklyGameRewardWinnersMessageEvent();
    }
}
