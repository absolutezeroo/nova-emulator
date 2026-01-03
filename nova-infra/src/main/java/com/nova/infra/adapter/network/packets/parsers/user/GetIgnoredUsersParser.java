package com.nova.infra.adapter.network.packets.parsers.user;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.user.GetIgnoredUsersMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses GetIgnoredUsers packet from client.
 */
@ParsesPacket(Incoming.USER_IGNORED)
public class GetIgnoredUsersParser extends PacketParser<GetIgnoredUsersMessageEvent> {
@Override
    public GetIgnoredUsersMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetIgnoredUsersMessageEvent();
    }
}
