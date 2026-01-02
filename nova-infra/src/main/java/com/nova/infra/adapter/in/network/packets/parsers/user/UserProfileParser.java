package com.nova.infra.adapter.in.network.packets.parsers.user;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.user.UserProfileMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses UserProfile packet from client.
 */
@ParsesPacket(Incoming.USER_PROFILE)
public class UserProfileParser extends PacketParser<UserProfileMessageEvent> {
@Override
    public UserProfileMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new UserProfileMessageEvent();
    }
}
