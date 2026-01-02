package com.nova.infra.adapter.in.network.packets.incoming.misc;

import com.nova.infra.adapter.in.network.packets.IIncomingPacket;

/**
 * Event received from client.
 */
public record GetUserSongDisksMessageEvent(
    // No fields parsed
) implements IIncomingPacket {}
