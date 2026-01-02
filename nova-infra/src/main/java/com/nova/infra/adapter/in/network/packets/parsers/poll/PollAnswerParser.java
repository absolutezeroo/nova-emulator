package com.nova.infra.adapter.in.network.packets.parsers.poll;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.poll.PollAnswerMessageEvent;

/**
 * Parses PollAnswer packet from client.
 */
public class PollAnswerParser extends PacketParser<PollAnswerMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.POLL_ANSWER;
    }

    @Override
    public PollAnswerMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new PollAnswerMessageEvent();
    }
}
