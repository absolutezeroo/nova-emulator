package com.nova.infra.adapter.in.network.packets.outgoing.misc;

import com.nova.infra.adapter.in.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record WelcomeGiftStatusMessage(
    String email,
    boolean isVerified,
    boolean allowChange,
    int furniId,
    boolean requestedByUser
) implements IOutgoingPacket {}
