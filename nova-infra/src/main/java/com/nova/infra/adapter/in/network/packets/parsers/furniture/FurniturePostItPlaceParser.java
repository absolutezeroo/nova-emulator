package com.nova.infra.adapter.in.network.packets.parsers.furniture;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.furniture.FurniturePostItPlaceMessageEvent;

/**
 * Parses FurniturePostItPlace packet from client.
 */
public class FurniturePostItPlaceParser extends PacketParser<FurniturePostItPlaceMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.FURNITURE_POSTIT_PLACE;
    }

    @Override
    public FurniturePostItPlaceMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new FurniturePostItPlaceMessageEvent();
    }
}
