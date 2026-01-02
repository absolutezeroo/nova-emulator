package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.UniqueIDMessageEvent;

/**
 * Parses UniqueID packet from client.
 */
public class UniqueIDParser extends PacketParser<UniqueIDMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.SECURITY_MACHINE;
    }

    @Override
    public UniqueIDMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new UniqueIDMessageEvent();
    }
}
