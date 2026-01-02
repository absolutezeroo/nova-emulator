package com.nova.infra.adapter.in.network.packets.parsers.crafting;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.crafting.CraftMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses Craft packet from client.
 */
@ParsesPacket(Incoming.CRAFT)
public class CraftParser extends PacketParser<CraftMessageEvent> {
@Override
    public CraftMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new CraftMessageEvent();
    }
}
