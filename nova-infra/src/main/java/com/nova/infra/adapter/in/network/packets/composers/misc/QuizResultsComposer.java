package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.QuizResultsMessage;

/**
 * Composes QuizResults packet for client.
 */
public class QuizResultsComposer extends PacketComposer<QuizResultsMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.QUIZ_RESULTS;
    }

    @Override
    protected void write(PacketBuffer packet, QuizResultsMessage message) {
        packet.appendString(message.quizCode());
    }
}
