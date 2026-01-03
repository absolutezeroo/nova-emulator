package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.DisconnectMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses Disconnect packet from client.
 */
@ParsesPacket(Incoming.DISCONNECT)
public class DisconnectParser extends PacketParser<DisconnectMessageEvent> {
@Override
    public DisconnectMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new DisconnectMessageEvent();
    }
}
