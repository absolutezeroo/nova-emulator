package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetCommunityGoalEarnedPrizesMessageEvent;

/**
 * Parses GetCommunityGoalEarnedPrizes packet from client.
 */
public class GetCommunityGoalEarnedPrizesParser extends PacketParser<GetCommunityGoalEarnedPrizesMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GET_COMMUNITY_GOAL_EARNED_PRIZES;
    }

    @Override
    public GetCommunityGoalEarnedPrizesMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetCommunityGoalEarnedPrizesMessageEvent();
    }
}
