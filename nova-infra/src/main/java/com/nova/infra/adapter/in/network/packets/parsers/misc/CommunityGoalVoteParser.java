package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.CommunityGoalVoteMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses CommunityGoalVote packet from client.
 */
@ParsesPacket(Incoming.COMMUNITY_GOAL_VOTE_COMPOSER)
public class CommunityGoalVoteParser extends PacketParser<CommunityGoalVoteMessageEvent> {
@Override
    public CommunityGoalVoteMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new CommunityGoalVoteMessageEvent();
    }
}
