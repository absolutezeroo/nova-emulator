package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.GetCommunityGoalHallOfFameMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses GetCommunityGoalHallOfFame packet from client.
 */
@ParsesPacket(Incoming.GET_COMMUNITY_GOAL_HALL_OF_FAME)
public class GetCommunityGoalHallOfFameParser extends PacketParser<GetCommunityGoalHallOfFameMessageEvent> {
@Override
    public GetCommunityGoalHallOfFameMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetCommunityGoalHallOfFameMessageEvent();
    }
}
