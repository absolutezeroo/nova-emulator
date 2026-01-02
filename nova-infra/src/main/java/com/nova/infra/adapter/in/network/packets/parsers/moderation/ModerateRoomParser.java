package com.nova.infra.adapter.in.network.packets.parsers.moderation;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.moderation.ModerateRoomMessageEvent;

/**
 * Parses ModerateRoom packet from client.
 */
public class ModerateRoomParser extends PacketParser<ModerateRoomMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.MODTOOL_CHANGE_ROOM_SETTINGS;
    }

    @Override
    public ModerateRoomMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new ModerateRoomMessageEvent();
    }
}
