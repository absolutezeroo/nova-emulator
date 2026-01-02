package com.nova.infra.adapter.in.network.packets.composers.group;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.group.GuildMembershipsMessage;

/**
 * Composes GuildMemberships packet for client.
 */
public class GuildMembershipsComposer extends PacketComposer<GuildMembershipsMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.GROUP_LIST;
    }

    @Override
    protected void write(PacketBuffer packet, GuildMembershipsMessage message) {
        // No fields to write
    }
}
