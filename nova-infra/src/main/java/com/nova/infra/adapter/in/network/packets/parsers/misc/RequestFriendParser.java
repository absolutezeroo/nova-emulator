package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.RequestFriendMessageEvent;

/**
 * Parses RequestFriend packet from client.
 */
public class RequestFriendParser extends PacketParser<RequestFriendMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.REQUEST_FRIEND;
    }

    @Override
    public RequestFriendMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RequestFriendMessageEvent();
    }
}
