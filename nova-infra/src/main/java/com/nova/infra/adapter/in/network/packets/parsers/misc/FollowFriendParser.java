package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.FollowFriendMessageEvent;

/**
 * Parses FollowFriend packet from client.
 */
public class FollowFriendParser extends PacketParser<FollowFriendMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.FOLLOW_FRIEND;
    }

    @Override
    public FollowFriendMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new FollowFriendMessageEvent();
    }
}
