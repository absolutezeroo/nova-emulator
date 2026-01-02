package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetBadgePointLimitsMessageEvent;

/**
 * Parses GetBadgePointLimits packet from client.
 */
public class GetBadgePointLimitsParser extends PacketParser<GetBadgePointLimitsMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GET_BADGE_POINTS_LIMITS;
    }

    @Override
    public GetBadgePointLimitsMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetBadgePointLimitsMessageEvent();
    }
}
