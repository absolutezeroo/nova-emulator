package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetConcurrentUsersRewardMessageEvent;

/**
 * Parses GetConcurrentUsersReward packet from client.
 */
public class GetConcurrentUsersRewardParser extends PacketParser<GetConcurrentUsersRewardMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GET_CONCURRENT_USERS_REWARD;
    }

    @Override
    public GetConcurrentUsersRewardMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetConcurrentUsersRewardMessageEvent();
    }
}
