package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.GoToFlatMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses GoToFlat packet from client.
 */
@ParsesPacket(Incoming.GO_TO_FLAT)
public class GoToFlatParser extends PacketParser<GoToFlatMessageEvent> {
@Override
    public GoToFlatMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GoToFlatMessageEvent();
    }
}
