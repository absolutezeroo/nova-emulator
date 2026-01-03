package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.SeasonalQuestsMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes SeasonalQuests packet for client.
 */
@ComposesPacket(Outgoing.SEASONAL_QUESTS)
public class SeasonalQuestsComposer extends PacketComposer<SeasonalQuestsMessage> {
@Override
    protected void write(PacketBuffer packet, SeasonalQuestsMessage message) {
        // No fields to write
    }
}
