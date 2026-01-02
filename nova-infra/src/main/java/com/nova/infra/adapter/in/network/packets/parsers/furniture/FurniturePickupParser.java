package com.nova.infra.adapter.in.network.packets.parsers.furniture;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.furniture.FurniturePickupMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses FurniturePickup packet from client.
 */
@ParsesPacket(Incoming.FURNITURE_PICKUP)
public class FurniturePickupParser extends PacketParser<FurniturePickupMessageEvent> {
@Override
    public FurniturePickupMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new FurniturePickupMessageEvent();
    }
}
