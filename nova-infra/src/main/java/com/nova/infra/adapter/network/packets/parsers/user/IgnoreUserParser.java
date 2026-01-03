package com.nova.infra.adapter.network.packets.parsers.user;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.user.IgnoreUserMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses IgnoreUser packet from client.
 */
@ParsesPacket(Incoming.USER_IGNORE)
public class IgnoreUserParser extends PacketParser<IgnoreUserMessageEvent> {
@Override
    public IgnoreUserMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new IgnoreUserMessageEvent();
    }
}
