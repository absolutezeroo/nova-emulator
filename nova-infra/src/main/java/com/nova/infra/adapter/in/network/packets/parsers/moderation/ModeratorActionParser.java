package com.nova.infra.adapter.in.network.packets.parsers.moderation;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.moderation.ModeratorActionMessageEvent;

/**
 * Parses ModeratorAction packet from client.
 */
public class ModeratorActionParser extends PacketParser<ModeratorActionMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.MODTOOL_ROOM_ALERT;
    }

    @Override
    public ModeratorActionMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new ModeratorActionMessageEvent();
    }
}
