package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.RentableSpaceStatusMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses RentableSpaceStatus packet from client.
 */
@ParsesPacket(Incoming.RENTABLE_SPACE_STATUS)
public class RentableSpaceStatusParser extends PacketParser<RentableSpaceStatusMessageEvent> {
@Override
    public RentableSpaceStatusMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RentableSpaceStatusMessageEvent();
    }
}
