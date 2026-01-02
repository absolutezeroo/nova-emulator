package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.CommunityGoalVoteMessageEvent;

/**
 * Parses CommunityGoalVote packet from client.
 */
public class CommunityGoalVoteParser extends PacketParser<CommunityGoalVoteMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.COMMUNITY_GOAL_VOTE_COMPOSER;
    }

    @Override
    public CommunityGoalVoteMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new CommunityGoalVoteMessageEvent();
    }
}
