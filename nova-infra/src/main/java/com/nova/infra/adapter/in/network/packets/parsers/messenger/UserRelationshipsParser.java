package com.nova.infra.adapter.in.network.packets.parsers.messenger;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.messenger.UserRelationshipsMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses UserRelationships packet from client.
 */
@ParsesPacket(Incoming.MESSENGER_RELATIONSHIPS)
public class UserRelationshipsParser extends PacketParser<UserRelationshipsMessageEvent> {
@Override
    public UserRelationshipsMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new UserRelationshipsMessageEvent();
    }
}
