package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.QuizDataMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

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
