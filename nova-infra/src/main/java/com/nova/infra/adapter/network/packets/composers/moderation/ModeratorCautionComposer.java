package com.nova.infra.adapter.network.packets.composers.moderation;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.moderation.ModeratorCautionMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes ModeratorCaution packet for client.
 */
@ComposesPacket(Outgoing.MODERATION_CAUTION)
public class ModeratorCautionComposer extends PacketComposer<ModeratorCautionMessage> {
@Override
    protected void write(PacketBuffer packet, ModeratorCautionMessage message) {
        // No fields to write
    }
}
