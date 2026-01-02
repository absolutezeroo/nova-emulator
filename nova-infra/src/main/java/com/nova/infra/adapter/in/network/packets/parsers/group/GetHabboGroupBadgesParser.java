package com.nova.infra.adapter.in.network.packets.parsers.group;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.group.GetHabboGroupBadgesMessageEvent;

/**
 * Parses GetHabboGroupBadges packet from client.
 */
public class GetHabboGroupBadgesParser extends PacketParser<GetHabboGroupBadgesMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GROUP_BADGES;
    }

    @Override
    public GetHabboGroupBadgesMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetHabboGroupBadgesMessageEvent();
    }
}
