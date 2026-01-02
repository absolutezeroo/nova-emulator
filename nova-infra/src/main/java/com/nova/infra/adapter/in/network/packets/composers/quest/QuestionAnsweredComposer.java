package com.nova.infra.adapter.in.network.packets.composers.quest;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.quest.QuestionAnsweredMessage;

/**
 * Composes QuestionAnswered packet for client.
 */
public class QuestionAnsweredComposer extends PacketComposer<QuestionAnsweredMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.QUESTION_ANSWERED;
    }

    @Override
    protected void write(PacketBuffer packet, QuestionAnsweredMessage message) {
        // No fields to write
    }
}
