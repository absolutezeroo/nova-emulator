package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.FurnitureOneWayDoorMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses FurnitureOneWayDoor packet from client.
 */
@ParsesPacket(Incoming.ONE_WAY_DOOR_CLICK)
public class FurnitureOneWayDoorParser extends PacketParser<FurnitureOneWayDoorMessageEvent> {
@Override
    public FurnitureOneWayDoorMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new FurnitureOneWayDoorMessageEvent();
    }
}
