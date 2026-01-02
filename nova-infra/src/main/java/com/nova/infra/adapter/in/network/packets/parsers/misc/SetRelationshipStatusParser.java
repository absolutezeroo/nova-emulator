package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.SetRelationshipStatusMessageEvent;

/**
 * Parses SetRelationshipStatus packet from client.
 */
public class SetRelationshipStatusParser extends PacketParser<SetRelationshipStatusMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.SET_RELATIONSHIP_STATUS;
    }

    @Override
    public SetRelationshipStatusMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new SetRelationshipStatusMessageEvent();
    }
}
