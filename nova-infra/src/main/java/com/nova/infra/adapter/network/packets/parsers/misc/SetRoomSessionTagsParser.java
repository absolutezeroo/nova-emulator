package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.SetRoomSessionTagsMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses SetRoomSessionTags packet from client.
 */
@ParsesPacket(Incoming.SET_ROOM_SESSION_TAGS)
public class SetRoomSessionTagsParser extends PacketParser<SetRoomSessionTagsMessageEvent> {
@Override
    public SetRoomSessionTagsMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new SetRoomSessionTagsMessageEvent();
    }
}
