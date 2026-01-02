package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.QuizDataMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes QuizData packet for client.
 */
@ComposesPacket(Outgoing.QUIZ_DATA)
public class QuizDataComposer extends PacketComposer<QuizDataMessage> {
@Override
    protected void write(PacketBuffer packet, QuizDataMessage message) {
        packet.appendString(message.quizCode());
    }
}
