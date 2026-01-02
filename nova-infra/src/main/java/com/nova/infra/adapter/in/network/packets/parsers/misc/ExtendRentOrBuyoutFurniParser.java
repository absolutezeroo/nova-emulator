package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.ExtendRentOrBuyoutFurniMessageEvent;

/**
 * Parses ExtendRentOrBuyoutFurni packet from client.
 */
public class ExtendRentOrBuyoutFurniParser extends PacketParser<ExtendRentOrBuyoutFurniMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.RENTABLE_EXTEND_RENT_OR_BUYOUT_FURNI;
    }

    @Override
    public ExtendRentOrBuyoutFurniMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new ExtendRentOrBuyoutFurniMessageEvent();
    }
}
