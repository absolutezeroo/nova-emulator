package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.AcceptFriendMessageEvent;

/**
 * Parses AcceptFriend packet from client.
 */
public class AcceptFriendParser extends PacketParser<AcceptFriendMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.ACCEPT_FRIEND;
    }

    @Override
    public AcceptFriendMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new AcceptFriendMessageEvent();
    }
}
