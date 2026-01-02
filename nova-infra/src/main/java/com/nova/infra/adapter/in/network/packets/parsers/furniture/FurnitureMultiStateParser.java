package com.nova.infra.adapter.in.network.packets.parsers.furniture;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.furniture.FurnitureMultiStateMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses FurnitureMultiState packet from client.
 */
@ParsesPacket(Incoming.FURNITURE_MULTISTATE)
public class FurnitureMultiStateParser extends PacketParser<FurnitureMultiStateMessageEvent> {
@Override
    public FurnitureMultiStateMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new FurnitureMultiStateMessageEvent();
    }
}
