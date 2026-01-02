package com.nova.infra.adapter.in.network.packets.parsers.room;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.room.ApplyTonerMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses ApplyToner packet from client.
 */
@ParsesPacket(Incoming.ROOM_TONER_APPLY)
public class ApplyTonerParser extends PacketParser<ApplyTonerMessageEvent> {
@Override
    public ApplyTonerMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new ApplyTonerMessageEvent();
    }
}
