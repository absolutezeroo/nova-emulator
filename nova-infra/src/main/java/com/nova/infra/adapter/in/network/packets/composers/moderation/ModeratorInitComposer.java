package com.nova.infra.adapter.in.network.packets.composers.moderation;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.moderation.ModeratorInitMessage;

/**
 * Composes ModeratorInit packet for client.
 */
public class ModeratorInitComposer extends PacketComposer<ModeratorInitMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.MODERATION_TOOL;
    }

    @Override
    protected void write(PacketBuffer packet, ModeratorInitMessage message) {
        // No fields to write
    }
}
