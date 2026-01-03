package com.nova.infra.adapter.network.packets.parsers.poll;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.poll.PollRejectMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses PollReject packet from client.
 */
@ParsesPacket(Incoming.POLL_REJECT)
public class PollRejectParser extends PacketParser<PollRejectMessageEvent> {
@Override
    public PollRejectMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new PollRejectMessageEvent();
    }
}
