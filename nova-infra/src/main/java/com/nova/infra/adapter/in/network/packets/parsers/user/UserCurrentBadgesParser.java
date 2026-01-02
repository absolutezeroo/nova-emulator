package com.nova.infra.adapter.in.network.packets.parsers.user;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.user.UserCurrentBadgesMessageEvent;

/**
 * Parses UserCurrentBadges packet from client.
 */
public class UserCurrentBadgesParser extends PacketParser<UserCurrentBadgesMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.USER_BADGES_CURRENT;
    }

    @Override
    public UserCurrentBadgesMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new UserCurrentBadgesMessageEvent();
    }
}
