package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.FurniturePlacePaintMessageEvent;

/**
 * Parses FurniturePlacePaint packet from client.
 */
public class FurniturePlacePaintParser extends PacketParser<FurniturePlacePaintMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.ITEM_PAINT;
    }

    @Override
    public FurniturePlacePaintMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new FurniturePlacePaintMessageEvent();
    }
}
