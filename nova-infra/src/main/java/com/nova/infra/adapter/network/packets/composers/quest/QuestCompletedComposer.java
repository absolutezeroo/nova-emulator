package com.nova.infra.adapter.network.packets.composers.quest;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.quest.QuestCompletedMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes QuestCompleted packet for client.
 */
@ComposesPacket(Outgoing.QUEST_COMPLETED)
public class QuestCompletedComposer extends PacketComposer<QuestCompletedMessage> {
@Override
    protected void write(PacketBuffer packet, QuestCompletedMessage message) {
        packet.appendBoolean(message.showDialog());
    }
}
