package com.nova.infra.adapter.network.packets.composers.moderation;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.moderation.ModeratorUserInfoMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes ModeratorUserInfo packet for client.
 */
@ComposesPacket(Outgoing.MODERATION_USER_INFO)
public class ModeratorUserInfoComposer extends PacketComposer<ModeratorUserInfoMessage> {
@Override
    protected void write(PacketBuffer packet, ModeratorUserInfoMessage message) {
        // No fields to write
    }
}
