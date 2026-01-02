package com.nova.infra.adapter.in.network.packets.composers.moderation;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.moderation.ModeratorUserInfoMessage;

/**
 * Composes ModeratorUserInfo packet for client.
 */
public class ModeratorUserInfoComposer extends PacketComposer<ModeratorUserInfoMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.MODERATION_USER_INFO;
    }

    @Override
    protected void write(PacketBuffer packet, ModeratorUserInfoMessage message) {
        // No fields to write
    }
}
