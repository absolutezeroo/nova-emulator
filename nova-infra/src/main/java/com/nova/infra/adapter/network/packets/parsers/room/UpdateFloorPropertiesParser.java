package com.nova.infra.adapter.network.packets.parsers.room;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.room.UpdateFloorPropertiesMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses UpdateFloorProperties packet from client.
 */
@ParsesPacket(Incoming.ROOM_MODEL_SAVE)
public class UpdateFloorPropertiesParser extends PacketParser<UpdateFloorPropertiesMessageEvent> {
@Override
    public UpdateFloorPropertiesMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new UpdateFloorPropertiesMessageEvent();
    }
}
