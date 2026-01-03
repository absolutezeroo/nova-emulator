package com.nova.infra.adapter.network.packets.outgoing.wired;

import com.nova.infra.adapter.network.packets.OutgoingPacket;

/**
 * Message sent to client.
 */
public record WiredFurniConditionMessage(
    // No fields parsed
) implements OutgoingPacket {}
