package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.GuildMemberMgmtFailedMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes GuildMemberMgmtFailed packet for client.
 */
@ComposesPacket(Outgoing.GUILD_MEMBER_MGMT_FAILED)
public class GuildMemberMgmtFailedComposer extends PacketComposer<GuildMemberMgmtFailedMessage> {
@Override
    protected void write(PacketBuffer packet, GuildMemberMgmtFailedMessage message) {
        packet.appendInt(message.guildId());
        packet.appendInt(message.reason());
    }
}
