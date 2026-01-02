package com.nova.infra.adapter.in.network.packets.parsers.user;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.user.SetActivatedBadgesMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses SetActivatedBadges packet from client.
 */
@ParsesPacket(Incoming.USER_BADGES_CURRENT_UPDATE)
public class SetActivatedBadgesParser extends PacketParser<SetActivatedBadgesMessageEvent> {
@Override
    public SetActivatedBadgesMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new SetActivatedBadgesMessageEvent();
    }
}
