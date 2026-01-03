package com.nova.infra.adapter.network.packets.parsers.furniture;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.furniture.FurnitureWallUpdateMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses FurnitureWallUpdate packet from client.
 */
@ParsesPacket(Incoming.FURNITURE_WALL_UPDATE)
public class FurnitureWallUpdateParser extends PacketParser<FurnitureWallUpdateMessageEvent> {
@Override
    public FurnitureWallUpdateMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new FurnitureWallUpdateMessageEvent();
    }
}
