package com.nova.infra.adapter.in.network.packets.parsers.moderation;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.moderation.ModMuteMessageEvent;

/**
 * Parses ModMute packet from client.
 */
public class ModMuteParser extends PacketParser<ModMuteMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.MODTOOL_SANCTION_MUTE;
    }

    @Override
    public ModMuteMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new ModMuteMessageEvent();
    }
}
