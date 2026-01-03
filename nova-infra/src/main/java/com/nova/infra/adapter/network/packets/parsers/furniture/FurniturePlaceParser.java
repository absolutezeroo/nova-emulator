package com.nova.infra.adapter.network.packets.parsers.furniture;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.furniture.FurniturePlaceMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses FurniturePlace packet from client.
 */
@ParsesPacket(Incoming.FURNITURE_PLACE)
public class FurniturePlaceParser extends PacketParser<FurniturePlaceMessageEvent> {
@Override
    public FurniturePlaceMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new FurniturePlaceMessageEvent();
    }
}
