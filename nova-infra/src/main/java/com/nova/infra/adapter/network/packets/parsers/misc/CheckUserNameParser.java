package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.CheckUserNameMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses CheckUserName packet from client.
 */
@ParsesPacket(Incoming.CHECK_USERNAME)
public class CheckUserNameParser extends PacketParser<CheckUserNameMessageEvent> {
@Override
    public CheckUserNameMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new CheckUserNameMessageEvent();
    }
}
