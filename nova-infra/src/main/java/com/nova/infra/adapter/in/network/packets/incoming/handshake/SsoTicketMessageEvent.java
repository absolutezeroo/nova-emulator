package com.nova.infra.adapter.in.network.packets.incoming.handshake;

import com.nova.infra.adapter.in.network.packets.IIncomingPacket;

/**
 * Event representing an SSO ticket authentication request.
 * <p>
 * Parsed from incoming packet ID 2419.
 *
 * @param ssoTicket the SSO ticket string from the client
 */
public record SsoTicketMessageEvent(String ssoTicket) implements IIncomingPacket {
}
