package com.nova.infra.adapter.in.network.packets.outgoing.misc;

import com.nova.infra.adapter.in.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record OfferRewardDeliveredMessage(
    String contentType,
    int classId,
    String name,
    String description
) implements IOutgoingPacket {}
