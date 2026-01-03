package com.nova.infra.adapter.network.packets.outgoing.misc;

import com.nova.infra.adapter.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record JoiningQueueFailedMessage(
    int gameTypeId,
    int reason
) implements IOutgoingPacket {}
