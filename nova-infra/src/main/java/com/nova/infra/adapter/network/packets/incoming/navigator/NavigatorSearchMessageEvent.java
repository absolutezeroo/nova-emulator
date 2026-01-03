package com.nova.infra.adapter.network.packets.incoming.navigator;

import com.nova.infra.adapter.network.packets.IncomingPacket;

/**
 * Event received from client.
 */
public record NavigatorSearchMessageEvent(
    // No fields parsed
) implements IncomingPacket {}
