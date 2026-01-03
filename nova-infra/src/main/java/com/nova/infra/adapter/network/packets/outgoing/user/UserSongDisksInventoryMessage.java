package com.nova.infra.adapter.network.packets.outgoing.user;

import com.nova.infra.adapter.network.packets.OutgoingPacket;

/**
 * Message sent to client.
 */
public record UserSongDisksInventoryMessage(
    // No fields parsed
) implements OutgoingPacket {}
