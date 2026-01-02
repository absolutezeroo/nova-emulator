package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetQuizQuestionsMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses GetQuizQuestions packet from client.
 */
@ParsesPacket(Incoming.GET_QUIZ_QUESTIONS)
public class GetQuizQuestionsParser extends PacketParser<GetQuizQuestionsMessageEvent> {
@Override
    public GetQuizQuestionsMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetQuizQuestionsMessageEvent();
    }
}
