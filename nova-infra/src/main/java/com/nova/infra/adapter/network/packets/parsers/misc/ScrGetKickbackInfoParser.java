package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.ScrGetKickbackInfoMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses ScrGetKickbackInfo packet from client.
 */
@ParsesPacket(Incoming.SCR_GET_KICKBACK_INFO)
public class ScrGetKickbackInfoParser extends PacketParser<ScrGetKickbackInfoMessageEvent> {
@Override
    public ScrGetKickbackInfoMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new ScrGetKickbackInfoMessageEvent();
    }
}
