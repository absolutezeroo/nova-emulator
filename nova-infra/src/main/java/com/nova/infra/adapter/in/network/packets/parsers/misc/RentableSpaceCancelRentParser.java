package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.RentableSpaceCancelRentMessageEvent;

/**
 * Parses RentableSpaceCancelRent packet from client.
 */
public class RentableSpaceCancelRentParser extends PacketParser<RentableSpaceCancelRentMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.RENTABLE_SPACE_CANCEL_RENT;
    }

    @Override
    public RentableSpaceCancelRentMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RentableSpaceCancelRentMessageEvent();
    }
}
