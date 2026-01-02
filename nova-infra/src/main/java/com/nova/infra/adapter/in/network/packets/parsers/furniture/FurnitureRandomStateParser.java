package com.nova.infra.adapter.in.network.packets.parsers.furniture;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.furniture.FurnitureRandomStateMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses FurnitureRandomState packet from client.
 */
@ParsesPacket(Incoming.FURNITURE_RANDOMSTATE)
public class FurnitureRandomStateParser extends PacketParser<FurnitureRandomStateMessageEvent> {
@Override
    public FurnitureRandomStateMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new FurnitureRandomStateMessageEvent();
    }
}
