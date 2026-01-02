package com.nova.infra.adapter.in.network.packets.composers.quest;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.quest.QuestsMessage;

/**
 * Composes Quests packet for client.
 */
public class QuestsComposer extends PacketComposer<QuestsMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.QUESTS;
    }

    @Override
    protected void write(PacketBuffer packet, QuestsMessage message) {
        // No fields to write
    }
}
