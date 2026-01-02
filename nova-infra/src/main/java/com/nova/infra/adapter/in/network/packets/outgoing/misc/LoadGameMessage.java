package com.nova.infra.adapter.in.network.packets.outgoing.misc;

import com.nova.infra.adapter.in.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record LoadGameMessage(
    int gameTypeId,
    String gameClientId,
    String url,
    String quality,
    String scaleMode,
    int frameRate,
    int minMajorVersion,
    int minMinorVersion
) implements IOutgoingPacket {}
