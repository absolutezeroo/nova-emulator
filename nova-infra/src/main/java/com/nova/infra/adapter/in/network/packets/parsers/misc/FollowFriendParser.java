package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.FollowFriendMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses FollowFriend packet from client.
 */
@ParsesPacket(Incoming.FOLLOW_FRIEND)
public class FollowFriendParser extends PacketParser<FollowFriendMessageEvent> {
@Override
    public FollowFriendMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new FollowFriendMessageEvent();
    }
}
