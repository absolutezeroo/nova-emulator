package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.VisitUserMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses VisitUser packet from client.
 */
@ParsesPacket(Incoming.VISIT_USER)
public class VisitUserParser extends PacketParser<VisitUserMessageEvent> {
@Override
    public VisitUserMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new VisitUserMessageEvent();
    }
}
