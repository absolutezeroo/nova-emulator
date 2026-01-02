package com.nova.infra.adapter.in.network.packets.composers.moderation;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.moderation.ModeratorInitMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes ModeratorInit packet for client.
 */
@ComposesPacket(Outgoing.MODERATION_TOOL)
public class ModeratorInitComposer extends PacketComposer<ModeratorInitMessage> {
@Override
    protected void write(PacketBuffer packet, ModeratorInitMessage message) {
        // No fields to write
    }
}
