package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.FurniturePlacePaintMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses FurniturePlacePaint packet from client.
 */
@ParsesPacket(Incoming.ITEM_PAINT)
public class FurniturePlacePaintParser extends PacketParser<FurniturePlacePaintMessageEvent> {
@Override
    public FurniturePlacePaintMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new FurniturePlacePaintMessageEvent();
    }
}
