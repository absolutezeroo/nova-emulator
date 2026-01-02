package com.nova.infra.adapter.in.network.packets.parsers.handshake;

import com.nova.core.domain.port.out.network.NetworkConnection;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.packets.incoming.handshake.SsoTicketMessageEvent;
import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;

/**
 * Parses SSO ticket authentication requests.
 * <p>
 * Reads the SSO ticket string from the incoming packet.
 */
public class SsoTicketParser extends PacketParser<SsoTicketMessageEvent> {

    @Override
    public int getPacketId() {
        return Incoming.SSO_TICKET;
    }

    @Override
    public SsoTicketMessageEvent parse(NetworkConnection connection, ClientMessage message) {
        String ssoTicket = message.readString();
        return new SsoTicketMessageEvent(ssoTicket);
    }
}
