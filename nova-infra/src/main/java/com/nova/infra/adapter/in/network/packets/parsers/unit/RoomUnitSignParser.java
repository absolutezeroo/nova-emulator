package com.nova.infra.adapter.in.network.packets.parsers.unit;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.unit.RoomUnitSignMessageEvent;

/**
 * Parses RoomUnitSign packet from client.
 */
public class RoomUnitSignParser extends PacketParser<RoomUnitSignMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.UNIT_SIGN;
    }

    @Override
    public RoomUnitSignMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RoomUnitSignMessageEvent();
    }
}
