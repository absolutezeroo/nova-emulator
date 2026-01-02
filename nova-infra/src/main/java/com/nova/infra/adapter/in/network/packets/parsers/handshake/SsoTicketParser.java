package com.nova.infra.adapter.in.network.packets.parsers.handshake;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.handshake.SSOTicketMessageEvent;

/**
 * Parses the SSOTicket packet from client.
 */
public class SSOTicketParser extends PacketParser<SSOTicketMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.S_S_O_TICKET;
    }

    @Override
    public SSOTicketMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new SSOTicketMessageEvent();
    }
}
