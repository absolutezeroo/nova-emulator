package com.nova.infra.adapter.network.packets.parsers.poll;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.poll.PollStartMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

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
