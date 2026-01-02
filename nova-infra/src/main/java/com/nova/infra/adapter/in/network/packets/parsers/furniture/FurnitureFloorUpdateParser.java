package com.nova.infra.adapter.in.network.packets.parsers.furniture;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.furniture.FurnitureFloorUpdateMessageEvent;

/**
 * Parses FurnitureFloorUpdate packet from client.
 */
public class FurnitureFloorUpdateParser extends PacketParser<FurnitureFloorUpdateMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.FURNITURE_FLOOR_UPDATE;
    }

    @Override
    public FurnitureFloorUpdateMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new FurnitureFloorUpdateMessageEvent();
    }
}
