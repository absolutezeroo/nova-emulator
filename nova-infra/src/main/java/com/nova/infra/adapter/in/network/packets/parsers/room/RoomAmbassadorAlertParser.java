package com.nova.infra.adapter.in.network.packets.parsers.room;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.room.RoomAmbassadorAlertMessageEvent;

/**
 * Parses RoomAmbassadorAlert packet from client.
 */
public class RoomAmbassadorAlertParser extends PacketParser<RoomAmbassadorAlertMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.ROOM_AMBASSADOR_ALERT;
    }

    @Override
    public RoomAmbassadorAlertMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RoomAmbassadorAlertMessageEvent();
    }
}
