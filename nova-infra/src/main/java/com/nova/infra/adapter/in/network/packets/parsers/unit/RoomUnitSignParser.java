package com.nova.infra.adapter.in.network.packets.parsers.unit;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.unit.RoomUnitSignMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses RoomUnitSign packet from client.
 */
@ParsesPacket(Incoming.UNIT_SIGN)
public class RoomUnitSignParser extends PacketParser<RoomUnitSignMessageEvent> {
@Override
    public RoomUnitSignMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RoomUnitSignMessageEvent();
    }
}
