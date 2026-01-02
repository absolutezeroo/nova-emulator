package com.nova.infra.adapter.in.network.packets.parsers.furniture;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.furniture.FurnitureMultiStateMessageEvent;

/**
 * Parses FurnitureMultiState packet from client.
 */
public class FurnitureMultiStateParser extends PacketParser<FurnitureMultiStateMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.FURNITURE_MULTISTATE;
    }

    @Override
    public FurnitureMultiStateMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new FurnitureMultiStateMessageEvent();
    }
}
