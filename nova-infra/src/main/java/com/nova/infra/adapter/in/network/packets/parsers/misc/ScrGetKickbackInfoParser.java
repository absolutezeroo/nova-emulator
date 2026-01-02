package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.ScrGetKickbackInfoMessageEvent;

/**
 * Parses ScrGetKickbackInfo packet from client.
 */
public class ScrGetKickbackInfoParser extends PacketParser<ScrGetKickbackInfoMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.SCR_GET_KICKBACK_INFO;
    }

    @Override
    public ScrGetKickbackInfoMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new ScrGetKickbackInfoMessageEvent();
    }
}
