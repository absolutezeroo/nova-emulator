package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.DisconnectMessageEvent;

/**
 * Parses Disconnect packet from client.
 */
public class DisconnectParser extends PacketParser<DisconnectMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.DISCONNECT;
    }

    @Override
    public DisconnectMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new DisconnectMessageEvent();
    }
}
