package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.RentableSpaceStatusMessageEvent;

/**
 * Parses RentableSpaceStatus packet from client.
 */
public class RentableSpaceStatusParser extends PacketParser<RentableSpaceStatusMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.RENTABLE_SPACE_STATUS;
    }

    @Override
    public RentableSpaceStatusMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RentableSpaceStatusMessageEvent();
    }
}
