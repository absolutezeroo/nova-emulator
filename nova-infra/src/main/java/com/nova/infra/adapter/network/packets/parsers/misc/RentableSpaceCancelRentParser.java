package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.RentableSpaceCancelRentMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses RentableSpaceCancelRent packet from client.
 */
@ParsesPacket(Incoming.RENTABLE_SPACE_CANCEL_RENT)
public class RentableSpaceCancelRentParser extends PacketParser<RentableSpaceCancelRentMessageEvent> {
@Override
    public RentableSpaceCancelRentMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RentableSpaceCancelRentMessageEvent();
    }
}
