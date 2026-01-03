package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.ChangeUserNameMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses ChangeUserName packet from client.
 */
@ParsesPacket(Incoming.CHANGE_USERNAME)
public class ChangeUserNameParser extends PacketParser<ChangeUserNameMessageEvent> {
@Override
    public ChangeUserNameMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new ChangeUserNameMessageEvent();
    }
}
