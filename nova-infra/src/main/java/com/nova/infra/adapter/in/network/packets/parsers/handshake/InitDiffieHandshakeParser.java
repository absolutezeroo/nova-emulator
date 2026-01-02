package com.nova.infra.adapter.in.network.packets.parsers.handshake;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.handshake.InitDiffieHandshakeMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses InitDiffieHandshake packet from client.
 */
@ParsesPacket(Incoming.HANDSHAKE_INIT_DIFFIE)
public class InitDiffieHandshakeParser extends PacketParser<InitDiffieHandshakeMessageEvent> {
@Override
    public InitDiffieHandshakeMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new InitDiffieHandshakeMessageEvent();
    }
}
