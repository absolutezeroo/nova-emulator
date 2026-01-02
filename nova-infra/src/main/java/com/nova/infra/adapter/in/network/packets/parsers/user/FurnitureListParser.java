package com.nova.infra.adapter.in.network.packets.parsers.user;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.user.FurnitureListMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses FurnitureList packet from client.
 */
@ParsesPacket(Incoming.USER_FURNITURE)
public class FurnitureListParser extends PacketParser<FurnitureListMessageEvent> {
@Override
    public FurnitureListMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new FurnitureListMessageEvent();
    }
}
