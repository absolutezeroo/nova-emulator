package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.ModeratorToolPreferencesMessage;

/**
 * Composes ModeratorToolPreferences packet for client.
 */
public class ModeratorToolPreferencesComposer extends PacketComposer<ModeratorToolPreferencesMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.MODERATOR_TOOL_PREFERENCES;
    }

    @Override
    protected void write(PacketBuffer packet, ModeratorToolPreferencesMessage message) {
        // No fields to write
    }
}
