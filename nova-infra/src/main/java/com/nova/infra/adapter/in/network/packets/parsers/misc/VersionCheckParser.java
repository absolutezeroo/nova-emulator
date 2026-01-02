package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.VersionCheckMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses VersionCheck packet from client.
 */
@ParsesPacket(Incoming.CLIENT_VARIABLES)
public class VersionCheckParser extends PacketParser<VersionCheckMessageEvent> {
@Override
    public VersionCheckMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new VersionCheckMessageEvent();
    }
}
