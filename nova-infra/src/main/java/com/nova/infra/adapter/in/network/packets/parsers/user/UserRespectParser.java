package com.nova.infra.adapter.in.network.packets.parsers.user;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.user.UserRespectMessageEvent;

/**
 * Parses UserRespect packet from client.
 */
public class UserRespectParser extends PacketParser<UserRespectMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.USER_RESPECT;
    }

    @Override
    public UserRespectMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new UserRespectMessageEvent();
    }
}
