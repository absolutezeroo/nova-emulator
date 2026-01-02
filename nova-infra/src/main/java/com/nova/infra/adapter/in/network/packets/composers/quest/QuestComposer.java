package com.nova.infra.adapter.in.network.packets.composers.quest;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.quest.QuestMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes Quest packet for client.
 */
@ComposesPacket(Outgoing.QUEST)
public class QuestComposer extends PacketComposer<QuestMessage> {
@Override
    protected void write(PacketBuffer packet, QuestMessage message) {
        packet.appendBoolean(message.expired());
    }
}
