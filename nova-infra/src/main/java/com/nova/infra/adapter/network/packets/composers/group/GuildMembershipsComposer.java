package com.nova.infra.adapter.network.packets.composers.group;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.group.GuildMembershipsMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes GuildMemberships packet for client.
 */
@ComposesPacket(Outgoing.GROUP_LIST)
public class GuildMembershipsComposer extends PacketComposer<GuildMembershipsMessage> {
@Override
    protected void write(PacketBuffer packet, GuildMembershipsMessage message) {
        // No fields to write
    }
}
