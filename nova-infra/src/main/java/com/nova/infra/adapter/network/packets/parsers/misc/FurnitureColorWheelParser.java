package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.FurnitureColorWheelMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses FurnitureColorWheel packet from client.
 */
@ParsesPacket(Incoming.ITEM_COLOR_WHEEL_CLICK)
public class FurnitureColorWheelParser extends PacketParser<FurnitureColorWheelMessageEvent> {
@Override
    public FurnitureColorWheelMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new FurnitureColorWheelMessageEvent();
    }
}
