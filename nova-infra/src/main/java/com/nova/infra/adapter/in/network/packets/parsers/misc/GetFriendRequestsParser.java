package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetFriendRequestsMessageEvent;

/**
 * Parses GetFriendRequests packet from client.
 */
public class GetFriendRequestsParser extends PacketParser<GetFriendRequestsMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GET_FRIEND_REQUESTS;
    }

    @Override
    public GetFriendRequestsMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetFriendRequestsMessageEvent();
    }
}
