package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.GetCommunityGoalEarnedPrizesMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses GetCommunityGoalEarnedPrizes packet from client.
 */
@ParsesPacket(Incoming.GET_COMMUNITY_GOAL_EARNED_PRIZES)
public class GetCommunityGoalEarnedPrizesParser extends PacketParser<GetCommunityGoalEarnedPrizesMessageEvent> {
@Override
    public GetCommunityGoalEarnedPrizesMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetCommunityGoalEarnedPrizesMessageEvent();
    }
}
