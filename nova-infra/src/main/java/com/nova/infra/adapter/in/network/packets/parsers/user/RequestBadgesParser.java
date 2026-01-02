package com.nova.infra.adapter.in.network.packets.parsers.user;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.user.RequestBadgesMessageEvent;

/**
 * Parses RequestBadges packet from client.
 */
public class RequestBadgesParser extends PacketParser<RequestBadgesMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.USER_BADGES;
    }

    @Override
    public RequestBadgesMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RequestBadgesMessageEvent();
    }
}
