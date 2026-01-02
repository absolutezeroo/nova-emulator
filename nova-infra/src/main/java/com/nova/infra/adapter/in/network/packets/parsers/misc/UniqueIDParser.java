package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.UniqueIDMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses UniqueID packet from client.
 */
@ParsesPacket(Incoming.SECURITY_MACHINE)
public class UniqueIDParser extends PacketParser<UniqueIDMessageEvent> {
@Override
    public UniqueIDMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new UniqueIDMessageEvent();
    }
}
