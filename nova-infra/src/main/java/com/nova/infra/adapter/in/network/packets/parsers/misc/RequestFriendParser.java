package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.RequestFriendMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses RequestFriend packet from client.
 */
@ParsesPacket(Incoming.REQUEST_FRIEND)
public class RequestFriendParser extends PacketParser<RequestFriendMessageEvent> {
@Override
    public RequestFriendMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RequestFriendMessageEvent();
    }
}
