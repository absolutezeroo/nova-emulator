package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.ExtendRentOrBuyoutStripItemMessageEvent;

/**
 * Parses ExtendRentOrBuyoutStripItem packet from client.
 */
public class ExtendRentOrBuyoutStripItemParser extends PacketParser<ExtendRentOrBuyoutStripItemMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.RENTABLE_EXTEND_RENT_OR_BUYOUT_STRIP_ITEM;
    }

    @Override
    public ExtendRentOrBuyoutStripItemMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new ExtendRentOrBuyoutStripItemMessageEvent();
    }
}
