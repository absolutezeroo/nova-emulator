package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.ChangeUserNameMessageEvent;

/**
 * Parses ChangeUserName packet from client.
 */
public class ChangeUserNameParser extends PacketParser<ChangeUserNameMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.CHANGE_USERNAME;
    }

    @Override
    public ChangeUserNameMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new ChangeUserNameMessageEvent();
    }
}
