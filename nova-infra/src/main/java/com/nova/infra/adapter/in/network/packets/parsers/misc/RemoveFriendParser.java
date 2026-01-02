package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.RemoveFriendMessageEvent;

/**
 * Parses RemoveFriend packet from client.
 */
public class RemoveFriendParser extends PacketParser<RemoveFriendMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.REMOVE_FRIEND;
    }

    @Override
    public RemoveFriendMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RemoveFriendMessageEvent();
    }
}
