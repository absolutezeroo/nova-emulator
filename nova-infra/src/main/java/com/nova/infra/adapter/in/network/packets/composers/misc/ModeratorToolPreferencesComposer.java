package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.ModeratorToolPreferencesMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes ModeratorToolPreferences packet for client.
 */
@ComposesPacket(Outgoing.MODERATOR_TOOL_PREFERENCES)
public class ModeratorToolPreferencesComposer extends PacketComposer<ModeratorToolPreferencesMessage> {
@Override
    protected void write(PacketBuffer packet, ModeratorToolPreferencesMessage message) {
        // No fields to write
    }
}
