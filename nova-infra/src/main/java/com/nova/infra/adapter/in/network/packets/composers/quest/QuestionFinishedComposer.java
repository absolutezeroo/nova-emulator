package com.nova.infra.adapter.in.network.packets.composers.quest;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.quest.QuestionFinishedMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes QuestionFinished packet for client.
 */
@ComposesPacket(Outgoing.QUESTION_FINISHED)
public class QuestionFinishedComposer extends PacketComposer<QuestionFinishedMessage> {
@Override
    protected void write(PacketBuffer packet, QuestionFinishedMessage message) {
        // No fields to write
    }
}
