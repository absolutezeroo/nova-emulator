package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.AcceptFriendMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

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
