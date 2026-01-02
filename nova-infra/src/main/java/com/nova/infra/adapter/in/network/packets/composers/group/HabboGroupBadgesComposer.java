package com.nova.infra.adapter.in.network.packets.composers.group;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.group.HabboGroupBadgesMessage;

/**
 * Composes HabboGroupBadges packet for client.
 */
public class HabboGroupBadgesComposer extends PacketComposer<HabboGroupBadgesMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.GROUP_BADGES;
    }

    @Override
    protected void write(PacketBuffer packet, HabboGroupBadgesMessage message) {
        // No fields to write
    }
}
