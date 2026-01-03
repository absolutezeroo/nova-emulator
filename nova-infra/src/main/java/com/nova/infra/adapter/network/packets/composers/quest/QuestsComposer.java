package com.nova.infra.adapter.network.packets.composers.quest;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.quest.QuestsMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes Quests packet for client.
 */
@ComposesPacket(Outgoing.QUESTS)
public class QuestsComposer extends PacketComposer<QuestsMessage> {
@Override
    protected void write(PacketBuffer packet, QuestsMessage message) {
        // No fields to write
    }
}
