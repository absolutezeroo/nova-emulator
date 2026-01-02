package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.GuildMemberMgmtFailedMessage;

/**
 * Composes GuildMemberMgmtFailed packet for client.
 */
public class GuildMemberMgmtFailedComposer extends PacketComposer<GuildMemberMgmtFailedMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.GUILD_MEMBER_MGMT_FAILED;
    }

    @Override
    protected void write(PacketBuffer packet, GuildMemberMgmtFailedMessage message) {
        packet.appendInt(message.guildId());
        packet.appendInt(message.reason());
    }
}
