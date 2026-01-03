package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.GuildEditFailedMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes GuildEditFailed packet for client.
 */
@ComposesPacket(Outgoing.GUILD_EDIT_FAILED)
public class GuildEditFailedComposer extends PacketComposer<GuildEditFailedMessage> {
@Override
    protected void write(PacketBuffer packet, GuildEditFailedMessage message) {
        packet.appendInt(message.reason());
    }
}
