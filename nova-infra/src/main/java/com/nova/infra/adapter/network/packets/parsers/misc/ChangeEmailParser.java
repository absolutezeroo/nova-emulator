package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.ChangeEmailMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

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
