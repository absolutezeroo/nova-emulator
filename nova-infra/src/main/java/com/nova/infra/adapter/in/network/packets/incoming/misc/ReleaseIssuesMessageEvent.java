package com.nova.infra.adapter.in.network.packets.incoming.misc;

import com.nova.infra.adapter.in.network.packets.IIncomingPacket;

/**
 * Event received from client.
 */
public record ReleaseIssuesMessageEvent(
    // No fields parsed
) implements IIncomingPacket {}
