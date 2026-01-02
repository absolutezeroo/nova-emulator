package com.nova.infra.adapter.in.network.packets.parsers.poll;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.poll.PollStartMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses PollStart packet from client.
 */
@ParsesPacket(Incoming.POLL_START)
public class PollStartParser extends PacketParser<PollStartMessageEvent> {
@Override
    public PollStartMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new PollStartMessageEvent();
    }
}
