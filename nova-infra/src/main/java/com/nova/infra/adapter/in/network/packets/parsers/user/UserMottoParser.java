package com.nova.infra.adapter.in.network.packets.parsers.user;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.user.UserMottoMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses UserMotto packet from client.
 */
@ParsesPacket(Incoming.USER_MOTTO)
public class UserMottoParser extends PacketParser<UserMottoMessageEvent> {
@Override
    public UserMottoMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new UserMottoMessageEvent();
    }
}
