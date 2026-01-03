package com.nova.infra.adapter.network.packets.parsers.user;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.user.IgnoreUserIdMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses IgnoreUserId packet from client.
 */
@ParsesPacket(Incoming.USER_IGNORE_ID)
public class IgnoreUserIdParser extends PacketParser<IgnoreUserIdMessageEvent> {
@Override
    public IgnoreUserIdMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new IgnoreUserIdMessageEvent();
    }
}
