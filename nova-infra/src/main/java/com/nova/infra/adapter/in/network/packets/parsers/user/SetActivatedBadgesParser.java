package com.nova.infra.adapter.in.network.packets.parsers.user;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.user.SetActivatedBadgesMessageEvent;

/**
 * Parses SetActivatedBadges packet from client.
 */
public class SetActivatedBadgesParser extends PacketParser<SetActivatedBadgesMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.USER_BADGES_CURRENT_UPDATE;
    }

    @Override
    public SetActivatedBadgesMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new SetActivatedBadgesMessageEvent();
    }
}
