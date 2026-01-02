package com.nova.infra.adapter.in.network.packets.outgoing.wired;

import com.nova.infra.adapter.in.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record WiredFurniTriggerMessage(
    // No fields parsed
) implements IOutgoingPacket {}
