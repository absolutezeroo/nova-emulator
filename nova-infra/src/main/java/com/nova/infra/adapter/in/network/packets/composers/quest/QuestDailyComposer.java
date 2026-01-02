package com.nova.infra.adapter.in.network.packets.composers.quest;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.quest.QuestDailyMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes QuestDaily packet for client.
 */
@ComposesPacket(Outgoing.QUEST_DAILY)
public class QuestDailyComposer extends PacketComposer<QuestDailyMessage> {
@Override
    protected void write(PacketBuffer packet, QuestDailyMessage message) {
        packet.appendInt(message.easyQuestCount());
        packet.appendInt(message.hardQuestCount());
    }
}
