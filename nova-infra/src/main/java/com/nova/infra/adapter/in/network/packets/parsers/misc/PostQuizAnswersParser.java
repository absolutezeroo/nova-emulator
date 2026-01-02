package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.PostQuizAnswersMessageEvent;

/**
 * Parses PostQuizAnswers packet from client.
 */
public class PostQuizAnswersParser extends PacketParser<PostQuizAnswersMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.POST_QUIZ_ANSWERS;
    }

    @Override
    public PostQuizAnswersMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new PostQuizAnswersMessageEvent();
    }
}
