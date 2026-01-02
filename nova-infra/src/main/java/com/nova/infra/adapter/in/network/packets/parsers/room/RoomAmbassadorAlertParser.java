package com.nova.infra.adapter.in.network.packets.parsers.room;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.room.RoomAmbassadorAlertMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses RoomAmbassadorAlert packet from client.
 */
@ParsesPacket(Incoming.ROOM_AMBASSADOR_ALERT)
public class RoomAmbassadorAlertParser extends PacketParser<RoomAmbassadorAlertMessageEvent> {
@Override
    public RoomAmbassadorAlertMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RoomAmbassadorAlertMessageEvent();
    }
}
