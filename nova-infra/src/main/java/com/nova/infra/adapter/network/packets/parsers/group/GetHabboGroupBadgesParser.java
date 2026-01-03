package com.nova.infra.adapter.network.packets.parsers.group;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.group.GetHabboGroupBadgesMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses GetHabboGroupBadges packet from client.
 */
@ParsesPacket(Incoming.GROUP_BADGES)
public class GetHabboGroupBadgesParser extends PacketParser<GetHabboGroupBadgesMessageEvent> {
@Override
    public GetHabboGroupBadgesMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetHabboGroupBadgesMessageEvent();
    }
}
