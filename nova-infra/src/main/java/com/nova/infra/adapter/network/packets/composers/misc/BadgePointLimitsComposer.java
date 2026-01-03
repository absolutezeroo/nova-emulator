package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.BadgePointLimitsMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes BadgePointLimits packet for client.
 */
@ComposesPacket(Outgoing.BADGE_POINT_LIMITS)
public class BadgePointLimitsComposer extends PacketComposer<BadgePointLimitsMessage> {
@Override
    protected void write(PacketBuffer packet, BadgePointLimitsMessage message) {
        // No fields to write
    }
}
