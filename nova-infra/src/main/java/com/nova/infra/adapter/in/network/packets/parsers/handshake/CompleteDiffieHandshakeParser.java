package com.nova.infra.adapter.in.network.packets.parsers.handshake;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.handshake.CompleteDiffieHandshakeMessageEvent;

/**
 * Parses CompleteDiffieHandshake packet from client.
 */
public class CompleteDiffieHandshakeParser extends PacketParser<CompleteDiffieHandshakeMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.HANDSHAKE_COMPLETE_DIFFIE;
    }

    @Override
    public CompleteDiffieHandshakeMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new CompleteDiffieHandshakeMessageEvent();
    }
}
