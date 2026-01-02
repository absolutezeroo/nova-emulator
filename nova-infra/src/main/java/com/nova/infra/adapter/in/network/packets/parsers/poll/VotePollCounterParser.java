package com.nova.infra.adapter.in.network.packets.parsers.poll;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.poll.VotePollCounterMessageEvent;

/**
 * Parses VotePollCounter packet from client.
 */
public class VotePollCounterParser extends PacketParser<VotePollCounterMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.POLL_VOTE_COUNTER;
    }

    @Override
    public VotePollCounterMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new VotePollCounterMessageEvent();
    }
}
