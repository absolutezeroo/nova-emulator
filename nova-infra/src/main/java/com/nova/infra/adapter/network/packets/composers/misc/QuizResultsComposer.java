package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.QuizResultsMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes QuizResults packet for client.
 */
@ComposesPacket(Outgoing.QUIZ_RESULTS)
public class QuizResultsComposer extends PacketComposer<QuizResultsMessage> {
@Override
    protected void write(PacketBuffer packet, QuizResultsMessage message) {
        packet.appendString(message.quizCode());
    }
}
