package com.nova.infra.adapter.network.packets.parsers.furniture;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.furniture.FurnitureFloorUpdateMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses FurnitureFloorUpdate packet from client.
 */
@ParsesPacket(Incoming.FURNITURE_FLOOR_UPDATE)
public class FurnitureFloorUpdateParser extends PacketParser<FurnitureFloorUpdateMessageEvent> {
@Override
    public FurnitureFloorUpdateMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new FurnitureFloorUpdateMessageEvent();
    }
}
