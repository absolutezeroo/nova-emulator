package com.nova.infra.adapter.network.packets.parsers.poll;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.poll.PollAnswerMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses PollAnswer packet from client.
 */
@ParsesPacket(Incoming.POLL_ANSWER)
public class PollAnswerParser extends PacketParser<PollAnswerMessageEvent> {
@Override
    public PollAnswerMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new PollAnswerMessageEvent();
    }
}
