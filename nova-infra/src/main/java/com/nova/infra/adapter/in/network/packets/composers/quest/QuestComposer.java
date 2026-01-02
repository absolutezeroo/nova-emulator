package com.nova.infra.adapter.in.network.packets.composers.quest;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.quest.QuestMessage;

/**
 * Composes Quest packet for client.
 */
public class QuestComposer extends PacketComposer<QuestMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.QUEST;
    }

    @Override
    protected void write(PacketBuffer packet, QuestMessage message) {
        packet.appendBoolean(message.expired());
    }
}
