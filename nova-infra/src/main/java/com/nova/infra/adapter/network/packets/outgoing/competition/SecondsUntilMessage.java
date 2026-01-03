package com.nova.infra.adapter.network.packets.outgoing.competition;

import com.nova.infra.adapter.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record SecondsUntilMessage(
    String timeStr,
    int secondsUntil
) implements IOutgoingPacket {}
