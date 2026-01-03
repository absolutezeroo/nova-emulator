package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.FindNewFriendsMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses FindNewFriends packet from client.
 */
@ParsesPacket(Incoming.FIND_NEW_FRIENDS)
public class FindNewFriendsParser extends PacketParser<FindNewFriendsMessageEvent> {
@Override
    public FindNewFriendsMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new FindNewFriendsMessageEvent();
    }
}
