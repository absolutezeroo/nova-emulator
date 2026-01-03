package com.nova.infra.adapter.network.packets.parsers.moderation;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.moderation.ModeratorActionMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses ModeratorAction packet from client.
 */
@ParsesPacket(Incoming.MODTOOL_ROOM_ALERT)
public class ModeratorActionParser extends PacketParser<ModeratorActionMessageEvent> {
@Override
    public ModeratorActionMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new ModeratorActionMessageEvent();
    }
}
