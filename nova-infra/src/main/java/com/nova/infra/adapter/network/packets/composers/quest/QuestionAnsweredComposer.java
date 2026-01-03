package com.nova.infra.adapter.network.packets.composers.quest;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.quest.QuestionAnsweredMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes QuestionAnswered packet for client.
 */
@ComposesPacket(Outgoing.QUESTION_ANSWERED)
public class QuestionAnsweredComposer extends PacketComposer<QuestionAnsweredMessage> {
@Override
    protected void write(PacketBuffer packet, QuestionAnsweredMessage message) {
        // No fields to write
    }
}
