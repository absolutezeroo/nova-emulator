package com.nova.infra.adapter.in.network.packets.parsers.user;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.user.UnignoreUserMessageEvent;

/**
 * Parses UnignoreUser packet from client.
 */
public class UnignoreUserParser extends PacketParser<UnignoreUserMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.USER_UNIGNORE;
    }

    @Override
    public UnignoreUserMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new UnignoreUserMessageEvent();
    }
}
