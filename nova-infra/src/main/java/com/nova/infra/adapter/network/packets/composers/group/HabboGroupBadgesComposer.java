package com.nova.infra.adapter.network.packets.composers.group;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.group.HabboGroupBadgesMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes HabboGroupBadges packet for client.
 */
@ComposesPacket(Outgoing.GROUP_BADGES)
public class HabboGroupBadgesComposer extends PacketComposer<HabboGroupBadgesMessage> {
@Override
    protected void write(PacketBuffer packet, HabboGroupBadgesMessage message) {
        // No fields to write
    }
}
