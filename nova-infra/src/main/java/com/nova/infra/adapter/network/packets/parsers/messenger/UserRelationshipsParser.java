package com.nova.infra.adapter.network.packets.parsers.messenger;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.messenger.UserRelationshipsMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

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
