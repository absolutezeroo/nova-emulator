package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.RentableSpaceStatusMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

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
