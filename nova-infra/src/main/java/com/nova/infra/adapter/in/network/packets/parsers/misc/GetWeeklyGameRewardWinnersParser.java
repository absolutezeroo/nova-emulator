package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetWeeklyGameRewardWinnersMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses GetWeeklyGameRewardWinners packet from client.
 */
@ParsesPacket(Incoming.GETWEEKLYGAMEREWARDWINNERS)
public class GetWeeklyGameRewardWinnersParser extends PacketParser<GetWeeklyGameRewardWinnersMessageEvent> {
@Override
    public GetWeeklyGameRewardWinnersMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetWeeklyGameRewardWinnersMessageEvent();
    }
}
