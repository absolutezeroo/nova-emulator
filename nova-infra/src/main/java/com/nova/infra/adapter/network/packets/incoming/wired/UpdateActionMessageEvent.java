package com.nova.infra.adapter.network.packets.incoming.wired;

import com.nova.infra.adapter.network.packets.IncomingPacket;

/**
 * Event received from client.
 */
public record UpdateActionMessageEvent(
    // No fields parsed
) implements IncomingPacket {}
