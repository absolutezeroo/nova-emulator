package com.nova.infra.adapter.in.network.packets.composers.quest;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.quest.QuestDailyMessage;

/**
 * Composes QuestDaily packet for client.
 */
public class QuestDailyComposer extends PacketComposer<QuestDailyMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.QUEST_DAILY;
    }

    @Override
    protected void write(PacketBuffer packet, QuestDailyMessage message) {
        packet.appendInt(message.easyQuestCount());
        packet.appendInt(message.hardQuestCount());
    }
}
