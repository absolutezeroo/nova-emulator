package com.nova.infra.adapter.in.network.packets.parsers.moderation;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.moderation.ModMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses Mod packet from client.
 */
@ParsesPacket(Incoming.MODTOOL_ALERTEVENT)
public class ModParser extends PacketParser<ModMessageEvent> {
@Override
    public ModMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new ModMessageEvent();
    }
}
