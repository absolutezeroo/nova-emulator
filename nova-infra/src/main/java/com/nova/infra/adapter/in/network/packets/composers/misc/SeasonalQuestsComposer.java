package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.SeasonalQuestsMessage;

/**
 * Composes SeasonalQuests packet for client.
 */
public class SeasonalQuestsComposer extends PacketComposer<SeasonalQuestsMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.SEASONAL_QUESTS;
    }

    @Override
    protected void write(PacketBuffer packet, SeasonalQuestsMessage message) {
        // No fields to write
    }
}
