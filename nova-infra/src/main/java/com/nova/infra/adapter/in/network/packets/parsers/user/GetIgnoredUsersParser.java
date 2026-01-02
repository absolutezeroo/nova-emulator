package com.nova.infra.adapter.in.network.packets.parsers.user;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.user.GetIgnoredUsersMessageEvent;

/**
 * Parses GetIgnoredUsers packet from client.
 */
public class GetIgnoredUsersParser extends PacketParser<GetIgnoredUsersMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.USER_IGNORED;
    }

    @Override
    public GetIgnoredUsersMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetIgnoredUsersMessageEvent();
    }
}
