package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.BadgePointLimitsMessage;

/**
 * Composes BadgePointLimits packet for client.
 */
public class BadgePointLimitsComposer extends PacketComposer<BadgePointLimitsMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.BADGE_POINT_LIMITS;
    }

    @Override
    protected void write(PacketBuffer packet, BadgePointLimitsMessage message) {
        // No fields to write
    }
}
