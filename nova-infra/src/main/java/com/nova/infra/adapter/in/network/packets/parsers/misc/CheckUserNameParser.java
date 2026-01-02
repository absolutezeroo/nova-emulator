package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.CheckUserNameMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

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
