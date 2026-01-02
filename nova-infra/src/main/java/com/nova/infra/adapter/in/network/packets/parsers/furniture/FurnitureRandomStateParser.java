package com.nova.infra.adapter.in.network.packets.parsers.furniture;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.furniture.FurnitureRandomStateMessageEvent;

/**
 * Parses FurnitureRandomState packet from client.
 */
public class FurnitureRandomStateParser extends PacketParser<FurnitureRandomStateMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.FURNITURE_RANDOMSTATE;
    }

    @Override
    public FurnitureRandomStateMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new FurnitureRandomStateMessageEvent();
    }
}
