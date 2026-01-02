package com.nova.infra.adapter.in.network.packets.outgoing.catalog;

import com.nova.infra.adapter.in.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record BuildersClubSubscriptionStatusMessage(
    int secondsLeft,
    int furniLimit,
    int maxFurniLimit,
    int secondsLeftWithGrace
) implements IOutgoingPacket {}
