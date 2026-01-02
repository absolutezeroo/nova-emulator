package com.nova.infra.adapter.in.network.packets.outgoing.misc;

import com.nova.infra.adapter.in.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record InitCameraMessage(
    int creditPrice,
    int ducketPrice,
    int publishDucketPrice
) implements IOutgoingPacket {}
