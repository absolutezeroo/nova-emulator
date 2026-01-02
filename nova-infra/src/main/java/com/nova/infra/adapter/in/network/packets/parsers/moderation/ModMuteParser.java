package com.nova.infra.adapter.in.network.packets.parsers.moderation;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.moderation.ModMuteMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses ModMute packet from client.
 */
@ParsesPacket(Incoming.MODTOOL_SANCTION_MUTE)
public class ModMuteParser extends PacketParser<ModMuteMessageEvent> {
@Override
    public ModMuteMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new ModMuteMessageEvent();
    }
}
