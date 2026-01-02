package com.nova.infra.adapter.in.network.packets.parsers.furniture;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.furniture.FurnitureWallMultiStateMessageEvent;

/**
 * Parses FurnitureWallMultiState packet from client.
 */
public class FurnitureWallMultiStateParser extends PacketParser<FurnitureWallMultiStateMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.FURNITURE_WALL_MULTISTATE;
    }

    @Override
    public FurnitureWallMultiStateMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new FurnitureWallMultiStateMessageEvent();
    }
}
