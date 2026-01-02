package com.nova.infra.adapter.in.network.packets.outgoing.misc;

import com.nova.infra.adapter.in.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record RentableSpaceStatusMessage(
    boolean rented,
    int canRentErrorCode,
    int renterId,
    String renterName,
    int timeRemaining,
    int price
) implements IOutgoingPacket {}
