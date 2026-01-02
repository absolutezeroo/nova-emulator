package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetQuizQuestionsMessageEvent;

/**
 * Parses GetQuizQuestions packet from client.
 */
public class GetQuizQuestionsParser extends PacketParser<GetQuizQuestionsMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GET_QUIZ_QUESTIONS;
    }

    @Override
    public GetQuizQuestionsMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetQuizQuestionsMessageEvent();
    }
}
