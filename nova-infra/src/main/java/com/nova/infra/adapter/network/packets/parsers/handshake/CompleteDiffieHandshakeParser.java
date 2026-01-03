package com.nova.infra.adapter.network.packets.parsers.handshake;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.handshake.CompleteDiffieHandshakeMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses CompleteDiffieHandshake packet from client.
 */
@ParsesPacket(Incoming.HANDSHAKE_COMPLETE_DIFFIE)
public class CompleteDiffieHandshakeParser extends PacketParser<CompleteDiffieHandshakeMessageEvent> {
@Override
    public CompleteDiffieHandshakeMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new CompleteDiffieHandshakeMessageEvent();
    }
}
