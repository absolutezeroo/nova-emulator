package com.nova.infra.adapter.in.network.packets.outgoing.competition;

import com.nova.infra.adapter.in.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record SecondsUntilMessage(
    String timeStr,
    int secondsUntil
) implements IOutgoingPacket {}
