package com.nova.infra.adapter.in.network.packets.parsers.furniture;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.furniture.FurniturePlaceMessageEvent;

/**
 * Parses FurniturePlace packet from client.
 */
public class FurniturePlaceParser extends PacketParser<FurniturePlaceMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.FURNITURE_PLACE;
    }

    @Override
    public FurniturePlaceMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new FurniturePlaceMessageEvent();
    }
}
