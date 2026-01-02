package com.nova.infra.adapter.in.network.packets.parsers.user;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.user.UserMottoMessageEvent;

/**
 * Parses UserMotto packet from client.
 */
public class UserMottoParser extends PacketParser<UserMottoMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.USER_MOTTO;
    }

    @Override
    public UserMottoMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new UserMottoMessageEvent();
    }
}
