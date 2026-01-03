package com.nova.infra.adapter.network.packets.parsers.room;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.room.RoomBanUserMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses RoomBanUser packet from client.
 */
@ParsesPacket(Incoming.ROOM_BAN_GIVE)
public class RoomBanUserParser extends PacketParser<RoomBanUserMessageEvent> {
@Override
    public RoomBanUserMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RoomBanUserMessageEvent();
    }
}
