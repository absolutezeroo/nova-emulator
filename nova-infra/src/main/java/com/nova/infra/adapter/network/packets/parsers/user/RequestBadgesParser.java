package com.nova.infra.adapter.network.packets.parsers.user;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.user.RequestBadgesMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses RequestBadges packet from client.
 */
@ParsesPacket(Incoming.USER_BADGES)
public class RequestBadgesParser extends PacketParser<RequestBadgesMessageEvent> {
@Override
    public RequestBadgesMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RequestBadgesMessageEvent();
    }
}
