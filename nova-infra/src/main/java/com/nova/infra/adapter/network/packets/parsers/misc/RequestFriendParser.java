package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.RequestFriendMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

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
