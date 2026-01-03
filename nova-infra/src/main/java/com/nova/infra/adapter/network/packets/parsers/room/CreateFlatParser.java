package com.nova.infra.adapter.network.packets.parsers.room;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.room.CreateFlatMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses CreateFlat packet from client.
 */
@ParsesPacket(Incoming.ROOM_CREATE)
public class CreateFlatParser extends PacketParser<CreateFlatMessageEvent> {
@Override
    public CreateFlatMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new CreateFlatMessageEvent();
    }
}
