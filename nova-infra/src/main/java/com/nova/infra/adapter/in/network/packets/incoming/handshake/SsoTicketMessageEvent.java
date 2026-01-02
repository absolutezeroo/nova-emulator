package com.nova.infra.adapter.in.network.packets.incoming.handshake;

import com.nova.infra.adapter.in.network.packets.IIncomingPacket;

/**
 * Event received from client for SSOTicket.
 */
public record SSOTicketMessageEvent(
    // No fields
) implements IIncomingPacket {}
