package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.VersionCheckMessageEvent;

/**
 * Parses VersionCheck packet from client.
 */
public class VersionCheckParser extends PacketParser<VersionCheckMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.CLIENT_VARIABLES;
    }

    @Override
    public VersionCheckMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new VersionCheckMessageEvent();
    }
}
