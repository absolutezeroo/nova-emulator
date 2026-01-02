package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.OpenPresentMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses OpenPresent packet from client.
 */
@ParsesPacket(Incoming.PRESENT_OPEN_PRESENT)
public class OpenPresentParser extends PacketParser<OpenPresentMessageEvent> {
@Override
    public OpenPresentMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new OpenPresentMessageEvent();
    }
}
