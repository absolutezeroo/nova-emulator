package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetConcurrentUsersGoalProgressMessageEvent;

/**
 * Parses GetConcurrentUsersGoalProgress packet from client.
 */
public class GetConcurrentUsersGoalProgressParser extends PacketParser<GetConcurrentUsersGoalProgressMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GET_CONCURRENT_USERS_GOAL_PROGRESS;
    }

    @Override
    public GetConcurrentUsersGoalProgressMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetConcurrentUsersGoalProgressMessageEvent();
    }
}
