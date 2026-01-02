package com.nova.infra.adapter.in.network.packets.parsers.furniture;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.furniture.FurnitureWallUpdateMessageEvent;

/**
 * Parses FurnitureWallUpdate packet from client.
 */
public class FurnitureWallUpdateParser extends PacketParser<FurnitureWallUpdateMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.FURNITURE_WALL_UPDATE;
    }

    @Override
    public FurnitureWallUpdateMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new FurnitureWallUpdateMessageEvent();
    }
}
