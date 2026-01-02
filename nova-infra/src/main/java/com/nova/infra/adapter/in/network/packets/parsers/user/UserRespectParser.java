package com.nova.infra.adapter.in.network.packets.parsers.user;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.user.UserRespectMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses UserRespect packet from client.
 */
@ParsesPacket(Incoming.USER_RESPECT)
public class UserRespectParser extends PacketParser<UserRespectMessageEvent> {
@Override
    public UserRespectMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new UserRespectMessageEvent();
    }
}
