package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.ScrGetKickbackInfoMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

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
