package com.nova.infra.adapter.network.packets.outgoing.youtube;

import com.nova.infra.adapter.network.packets.OutgoingPacket;

/**
 * Message sent to client.
 */
public record YoutubeDisplayPlaylistsMessage(
    // No fields parsed
) implements OutgoingPacket {}
