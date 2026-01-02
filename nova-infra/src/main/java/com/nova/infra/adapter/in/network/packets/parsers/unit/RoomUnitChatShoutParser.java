package com.nova.infra.adapter.in.network.packets.parsers.unit;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.unit.RoomUnitChatShoutMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses RoomUnitChatShout packet from client.
 */
@ParsesPacket(Incoming.UNIT_CHAT_SHOUT)
public class RoomUnitChatShoutParser extends PacketParser<RoomUnitChatShoutMessageEvent> {
@Override
    public RoomUnitChatShoutMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RoomUnitChatShoutMessageEvent();
    }
}
