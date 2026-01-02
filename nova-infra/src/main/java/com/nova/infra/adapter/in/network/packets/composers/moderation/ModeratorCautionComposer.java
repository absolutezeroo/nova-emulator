package com.nova.infra.adapter.in.network.packets.composers.moderation;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.moderation.ModeratorCautionMessage;

/**
 * Composes ModeratorCaution packet for client.
 */
public class ModeratorCautionComposer extends PacketComposer<ModeratorCautionMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.MODERATION_CAUTION;
    }

    @Override
    protected void write(PacketBuffer packet, ModeratorCautionMessage message) {
        // No fields to write
    }
}
