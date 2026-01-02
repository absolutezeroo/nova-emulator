package com.nova.infra.adapter.in.network.packets.parsers.crafting;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.crafting.CraftMessageEvent;

/**
 * Parses Craft packet from client.
 */
public class CraftParser extends PacketParser<CraftMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.CRAFT;
    }

    @Override
    public CraftMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new CraftMessageEvent();
    }
}
