package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.AcceptFriendMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses AcceptFriend packet from client.
 */
@ParsesPacket(Incoming.ACCEPT_FRIEND)
public class AcceptFriendParser extends PacketParser<AcceptFriendMessageEvent> {
@Override
    public AcceptFriendMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new AcceptFriendMessageEvent();
    }
}
