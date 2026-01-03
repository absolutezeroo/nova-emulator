package com.nova.infra.adapter.network.packets.parsers.poll;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.poll.VotePollCounterMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses VotePollCounter packet from client.
 */
@ParsesPacket(Incoming.POLL_VOTE_COUNTER)
public class VotePollCounterParser extends PacketParser<VotePollCounterMessageEvent> {
@Override
    public VotePollCounterMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new VotePollCounterMessageEvent();
    }
}
