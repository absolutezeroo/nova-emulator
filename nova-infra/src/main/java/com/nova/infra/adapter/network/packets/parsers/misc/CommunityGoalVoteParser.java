package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.CommunityGoalVoteMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

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
