package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.QuizDataMessage;

/**
 * Composes QuizData packet for client.
 */
public class QuizDataComposer extends PacketComposer<QuizDataMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.QUIZ_DATA;
    }

    @Override
    protected void write(PacketBuffer packet, QuizDataMessage message) {
        packet.appendString(message.quizCode());
    }
}
