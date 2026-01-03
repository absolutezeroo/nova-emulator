package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.FurnitureStackHeightMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses FurnitureStackHeight packet from client.
 */
@ParsesPacket(Incoming.ITEM_STACK_HELPER)
public class FurnitureStackHeightParser extends PacketParser<FurnitureStackHeightMessageEvent> {
@Override
    public FurnitureStackHeightMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new FurnitureStackHeightMessageEvent();
    }
}
