package com.nova.infra.adapter.in.network.packets.composers.quest;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.quest.QuestCancelledMessage;

/**
 * Composes QuestCancelled packet for client.
 */
public class QuestCancelledComposer extends PacketComposer<QuestCancelledMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.QUEST_CANCELLED;
    }

    @Override
    protected void write(PacketBuffer packet, QuestCancelledMessage message) {
        packet.appendBoolean(message.expired());
    }
}
