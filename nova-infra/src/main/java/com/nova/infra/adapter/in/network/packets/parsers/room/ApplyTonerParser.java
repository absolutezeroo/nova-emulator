package com.nova.infra.adapter.in.network.packets.parsers.room;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.room.ApplyTonerMessageEvent;

/**
 * Parses ApplyToner packet from client.
 */
public class ApplyTonerParser extends PacketParser<ApplyTonerMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.ROOM_TONER_APPLY;
    }

    @Override
    public ApplyTonerMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new ApplyTonerMessageEvent();
    }
}
