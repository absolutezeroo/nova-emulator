package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.RentableSpaceRentMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses RentableSpaceRent packet from client.
 */
@ParsesPacket(Incoming.RENTABLE_SPACE_RENT)
public class RentableSpaceRentParser extends PacketParser<RentableSpaceRentMessageEvent> {
@Override
    public RentableSpaceRentMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RentableSpaceRentMessageEvent();
    }
}
