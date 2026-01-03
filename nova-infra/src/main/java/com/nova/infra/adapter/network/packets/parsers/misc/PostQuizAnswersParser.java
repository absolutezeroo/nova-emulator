package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.PostQuizAnswersMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses PostQuizAnswers packet from client.
 */
@ParsesPacket(Incoming.POST_QUIZ_ANSWERS)
public class PostQuizAnswersParser extends PacketParser<PostQuizAnswersMessageEvent> {
@Override
    public PostQuizAnswersMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new PostQuizAnswersMessageEvent();
    }
}
