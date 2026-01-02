package com.nova.infra.adapter.in.network.packets.parsers.furniture;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.furniture.FurnitureAliasesMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses FurnitureAliases packet from client.
 */
@ParsesPacket(Incoming.FURNITURE_ALIASES)
public class FurnitureAliasesParser extends PacketParser<FurnitureAliasesMessageEvent> {
@Override
    public FurnitureAliasesMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new FurnitureAliasesMessageEvent();
    }
}
