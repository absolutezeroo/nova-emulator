package com.nova.infra.adapter.in.network.packets.parsers.user;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.user.UnignoreUserMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses UnignoreUser packet from client.
 */
@ParsesPacket(Incoming.USER_UNIGNORE)
public class UnignoreUserParser extends PacketParser<UnignoreUserMessageEvent> {
@Override
    public UnignoreUserMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new UnignoreUserMessageEvent();
    }
}
