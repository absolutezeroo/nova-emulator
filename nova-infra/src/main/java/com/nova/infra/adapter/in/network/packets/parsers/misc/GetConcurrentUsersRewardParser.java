package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetConcurrentUsersRewardMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses GetConcurrentUsersReward packet from client.
 */
@ParsesPacket(Incoming.GET_CONCURRENT_USERS_REWARD)
public class GetConcurrentUsersRewardParser extends PacketParser<GetConcurrentUsersRewardMessageEvent> {
@Override
    public GetConcurrentUsersRewardMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetConcurrentUsersRewardMessageEvent();
    }
}
