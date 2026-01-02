package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.ChangeEmailMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses ChangeEmail packet from client.
 */
@ParsesPacket(Incoming.EMAIL_CHANGE)
public class ChangeEmailParser extends PacketParser<ChangeEmailMessageEvent> {
@Override
    public ChangeEmailMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new ChangeEmailMessageEvent();
    }
}
