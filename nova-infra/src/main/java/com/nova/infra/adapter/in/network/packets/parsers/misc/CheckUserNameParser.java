package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.CheckUserNameMessageEvent;

/**
 * Parses CheckUserName packet from client.
 */
public class CheckUserNameParser extends PacketParser<CheckUserNameMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.CHECK_USERNAME;
    }

    @Override
    public CheckUserNameMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new CheckUserNameMessageEvent();
    }
}
