package com.nova.infra.adapter.network.packets.outgoing.navigator;

import com.nova.infra.adapter.network.packets.OutgoingPacket;

/**
 * Message sent to client.
 */
public record NavigatorMetadataMessage(
    // No fields parsed
) implements OutgoingPacket {}
