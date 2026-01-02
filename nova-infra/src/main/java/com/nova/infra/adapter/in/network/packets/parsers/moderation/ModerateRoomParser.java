package com.nova.infra.adapter.in.network.packets.parsers.moderation;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.moderation.ModerateRoomMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses ModerateRoom packet from client.
 */
@ParsesPacket(Incoming.MODTOOL_CHANGE_ROOM_SETTINGS)
public class ModerateRoomParser extends PacketParser<ModerateRoomMessageEvent> {
@Override
    public ModerateRoomMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new ModerateRoomMessageEvent();
    }
}
