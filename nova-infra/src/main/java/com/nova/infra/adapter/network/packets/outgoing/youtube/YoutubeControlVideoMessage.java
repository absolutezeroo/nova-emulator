package com.nova.infra.adapter.network.packets.outgoing.youtube;

import com.nova.infra.adapter.network.packets.OutgoingPacket;

/**
 * Message sent to client.
 */
public record YoutubeControlVideoMessage(
    int furniId,
    int commandId
) implements OutgoingPacket {}
