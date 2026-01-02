package com.nova.infra.adapter.in.network.packets.parsers.user;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.user.FurnitureListMessageEvent;

/**
 * Parses FurnitureList packet from client.
 */
public class FurnitureListParser extends PacketParser<FurnitureListMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.USER_FURNITURE;
    }

    @Override
    public FurnitureListMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new FurnitureListMessageEvent();
    }
}
