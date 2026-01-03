package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.SetRelationshipStatusMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses SetRelationshipStatus packet from client.
 */
@ParsesPacket(Incoming.SET_RELATIONSHIP_STATUS)
public class SetRelationshipStatusParser extends PacketParser<SetRelationshipStatusMessageEvent> {
@Override
    public SetRelationshipStatusMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new SetRelationshipStatusMessageEvent();
    }
}
