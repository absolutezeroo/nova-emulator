package com.nova.infra.adapter.in.network.packets.composers.quest;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.quest.QuestionMessage;

/**
 * Composes Question packet for client.
 */
public class QuestionComposer extends PacketComposer<QuestionMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.QUESTION;
    }

    @Override
    protected void write(PacketBuffer packet, QuestionMessage message) {
        // No fields to write
    }
}
