package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.SetRoomSessionTagsMessageEvent;

/**
 * Parses SetRoomSessionTags packet from client.
 */
public class SetRoomSessionTagsParser extends PacketParser<SetRoomSessionTagsMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.SET_ROOM_SESSION_TAGS;
    }

    @Override
    public SetRoomSessionTagsMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new SetRoomSessionTagsMessageEvent();
    }
}
