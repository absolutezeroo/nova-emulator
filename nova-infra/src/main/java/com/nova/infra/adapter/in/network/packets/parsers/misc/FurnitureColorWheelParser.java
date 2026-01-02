package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.FurnitureColorWheelMessageEvent;

/**
 * Parses FurnitureColorWheel packet from client.
 */
public class FurnitureColorWheelParser extends PacketParser<FurnitureColorWheelMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.ITEM_COLOR_WHEEL_CLICK;
    }

    @Override
    public FurnitureColorWheelMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new FurnitureColorWheelMessageEvent();
    }
}
