package com.nova.infra.adapter.in.network.packets.outgoing.misc;

import com.nova.infra.adapter.in.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record AvailabilityStatusMessage(
    boolean isOpen,
    boolean onShutdown,
    boolean isAuthenticUser
) implements IOutgoingPacket {}
