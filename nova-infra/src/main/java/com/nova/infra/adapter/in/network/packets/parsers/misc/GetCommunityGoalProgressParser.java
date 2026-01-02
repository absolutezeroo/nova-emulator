package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetCommunityGoalProgressMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses GetCommunityGoalProgress packet from client.
 */
@ParsesPacket(Incoming.GET_COMMUNITY_GOAL_PROGRESS)
public class GetCommunityGoalProgressParser extends PacketParser<GetCommunityGoalProgressMessageEvent> {
@Override
    public GetCommunityGoalProgressMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetCommunityGoalProgressMessageEvent();
    }
}
