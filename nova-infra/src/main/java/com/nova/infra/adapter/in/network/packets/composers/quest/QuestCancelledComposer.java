package com.nova.infra.adapter.in.network.packets.composers.quest;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.quest.QuestCancelledMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes QuestCancelled packet for client.
 */
@ComposesPacket(Outgoing.QUEST_CANCELLED)
public class QuestCancelledComposer extends PacketComposer<QuestCancelledMessage> {
@Override
    protected void write(PacketBuffer packet, QuestCancelledMessage message) {
        packet.appendBoolean(message.expired());
    }
}
