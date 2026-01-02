package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetBadgePointLimitsMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses GetBadgePointLimits packet from client.
 */
@ParsesPacket(Incoming.GET_BADGE_POINTS_LIMITS)
public class GetBadgePointLimitsParser extends PacketParser<GetBadgePointLimitsMessageEvent> {
@Override
    public GetBadgePointLimitsMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetBadgePointLimitsMessageEvent();
    }
}
