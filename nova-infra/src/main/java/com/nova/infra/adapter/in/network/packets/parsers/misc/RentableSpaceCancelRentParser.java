package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.RentableSpaceCancelRentMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

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
