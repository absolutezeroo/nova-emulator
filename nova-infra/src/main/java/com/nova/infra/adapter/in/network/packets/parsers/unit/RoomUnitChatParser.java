package com.nova.infra.adapter.in.network.packets.parsers.unit;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.unit.RoomUnitChatMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses RoomUnitChat packet from client.
 */
@ParsesPacket(Incoming.UNIT_CHAT)
public class RoomUnitChatParser extends PacketParser<RoomUnitChatMessageEvent> {
@Override
    public RoomUnitChatMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RoomUnitChatMessageEvent();
    }
}
