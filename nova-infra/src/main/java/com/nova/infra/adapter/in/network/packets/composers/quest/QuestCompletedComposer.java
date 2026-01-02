package com.nova.infra.adapter.in.network.packets.composers.quest;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.quest.QuestCompletedMessage;

/**
 * Composes QuestCompleted packet for client.
 */
public class QuestCompletedComposer extends PacketComposer<QuestCompletedMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.QUEST_COMPLETED;
    }

    @Override
    protected void write(PacketBuffer packet, QuestCompletedMessage message) {
        packet.appendBoolean(message.showDialog());
    }
}
