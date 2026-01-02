package com.nova.infra.adapter.in.network.packets.outgoing.youtube;

import com.nova.infra.adapter.in.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record YoutubeControlVideoMessage(
    int furniId,
    int commandId
) implements IOutgoingPacket {}
