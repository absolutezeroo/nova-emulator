package com.nova.infra.adapter.network.packets.outgoing.misc;

import com.nova.infra.adapter.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record NotEnoughBalanceMessage(
    boolean notEnoughCredits,
    boolean notEnoughActivityPoints,
    int activityPointType
) implements IOutgoingPacket {}
