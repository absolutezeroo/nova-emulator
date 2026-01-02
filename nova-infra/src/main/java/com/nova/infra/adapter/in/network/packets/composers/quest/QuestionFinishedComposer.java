package com.nova.infra.adapter.in.network.packets.composers.quest;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.quest.QuestionFinishedMessage;

/**
 * Composes QuestionFinished packet for client.
 */
public class QuestionFinishedComposer extends PacketComposer<QuestionFinishedMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.QUESTION_FINISHED;
    }

    @Override
    protected void write(PacketBuffer packet, QuestionFinishedMessage message) {
        // No fields to write
    }
}
