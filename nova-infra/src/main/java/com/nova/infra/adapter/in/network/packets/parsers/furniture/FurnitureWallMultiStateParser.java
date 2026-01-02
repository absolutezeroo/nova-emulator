package com.nova.infra.adapter.in.network.packets.parsers.furniture;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.furniture.FurnitureWallMultiStateMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses FurnitureWallMultiState packet from client.
 */
@ParsesPacket(Incoming.FURNITURE_WALL_MULTISTATE)
public class FurnitureWallMultiStateParser extends PacketParser<FurnitureWallMultiStateMessageEvent> {
@Override
    public FurnitureWallMultiStateMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new FurnitureWallMultiStateMessageEvent();
    }
}
