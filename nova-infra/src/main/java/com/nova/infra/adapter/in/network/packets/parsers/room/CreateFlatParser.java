package com.nova.infra.adapter.in.network.packets.parsers.room;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.room.CreateFlatMessageEvent;

/**
 * Parses CreateFlat packet from client.
 */
public class CreateFlatParser extends PacketParser<CreateFlatMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.ROOM_CREATE;
    }

    @Override
    public CreateFlatMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new CreateFlatMessageEvent();
    }
}
