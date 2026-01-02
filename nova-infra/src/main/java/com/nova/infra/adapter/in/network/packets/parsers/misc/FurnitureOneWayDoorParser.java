package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.FurnitureOneWayDoorMessageEvent;

/**
 * Parses FurnitureOneWayDoor packet from client.
 */
public class FurnitureOneWayDoorParser extends PacketParser<FurnitureOneWayDoorMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.ONE_WAY_DOOR_CLICK;
    }

    @Override
    public FurnitureOneWayDoorMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new FurnitureOneWayDoorMessageEvent();
    }
}
