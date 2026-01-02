package com.nova.infra.adapter.in.network.packets.parsers.user;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.user.IgnoreUserIdMessageEvent;

/**
 * Parses IgnoreUserId packet from client.
 */
public class IgnoreUserIdParser extends PacketParser<IgnoreUserIdMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.USER_IGNORE_ID;
    }

    @Override
    public IgnoreUserIdMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new IgnoreUserIdMessageEvent();
    }
}
