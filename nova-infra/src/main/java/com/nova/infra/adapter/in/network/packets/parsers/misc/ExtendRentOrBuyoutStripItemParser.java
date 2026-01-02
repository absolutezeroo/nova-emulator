package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.ExtendRentOrBuyoutStripItemMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses ExtendRentOrBuyoutStripItem packet from client.
 */
@ParsesPacket(Incoming.RENTABLE_EXTEND_RENT_OR_BUYOUT_STRIP_ITEM)
public class ExtendRentOrBuyoutStripItemParser extends PacketParser<ExtendRentOrBuyoutStripItemMessageEvent> {
@Override
    public ExtendRentOrBuyoutStripItemMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new ExtendRentOrBuyoutStripItemMessageEvent();
    }
}
