package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.ExtendRentOrBuyoutFurniMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses ExtendRentOrBuyoutFurni packet from client.
 */
@ParsesPacket(Incoming.RENTABLE_EXTEND_RENT_OR_BUYOUT_FURNI)
public class ExtendRentOrBuyoutFurniParser extends PacketParser<ExtendRentOrBuyoutFurniMessageEvent> {
@Override
    public ExtendRentOrBuyoutFurniMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new ExtendRentOrBuyoutFurniMessageEvent();
    }
}
