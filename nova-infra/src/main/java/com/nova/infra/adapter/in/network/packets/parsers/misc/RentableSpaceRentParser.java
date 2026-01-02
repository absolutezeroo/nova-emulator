package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.RentableSpaceRentMessageEvent;

/**
 * Parses RentableSpaceRent packet from client.
 */
public class RentableSpaceRentParser extends PacketParser<RentableSpaceRentMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.RENTABLE_SPACE_RENT;
    }

    @Override
    public RentableSpaceRentMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RentableSpaceRentMessageEvent();
    }
}
