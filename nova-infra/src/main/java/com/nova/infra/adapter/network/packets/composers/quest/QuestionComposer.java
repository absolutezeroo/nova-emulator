package com.nova.infra.adapter.network.packets.composers.quest;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.quest.QuestionMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes Question packet for client.
 */
@ComposesPacket(Outgoing.QUESTION)
public class QuestionComposer extends PacketComposer<QuestionMessage> {
@Override
    protected void write(PacketBuffer packet, QuestionMessage message) {
        // No fields to write
    }
}
