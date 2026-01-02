package com.nova.infra.adapter.in.network.packets.parsers.handshake;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.handshake.SSOTicketMessageEvent;

/**
 * Parses SSOTicket packet from client.
 */
public class SSOTicketParser extends PacketParser<SSOTicketMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.SECURITY_TICKET;
    }

    @Override
    public SSOTicketMessageEvent parse(ClientMessage message) {
        String ssoTicket = message.readString();
        return new SSOTicketMessageEvent(ssoTicket);
    }
}
