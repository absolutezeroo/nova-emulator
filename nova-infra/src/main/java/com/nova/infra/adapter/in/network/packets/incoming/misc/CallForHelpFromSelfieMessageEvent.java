package com.nova.infra.adapter.in.network.packets.incoming.misc;

import com.nova.infra.adapter.in.network.packets.IIncomingPacket;

/**
 * Event received from client.
 */
public record CallForHelpFromSelfieMessageEvent(
    // No fields parsed
) implements IIncomingPacket {}
