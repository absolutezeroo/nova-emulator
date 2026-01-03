package com.nova.infra.adapter.network.packets.parsers.furniture;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.furniture.FurniturePostItPlaceMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses FurniturePostItPlace packet from client.
 */
@ParsesPacket(Incoming.FURNITURE_POSTIT_PLACE)
public class FurniturePostItPlaceParser extends PacketParser<FurniturePostItPlaceMessageEvent> {
@Override
    public FurniturePostItPlaceMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new FurniturePostItPlaceMessageEvent();
    }
}
