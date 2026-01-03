package com.nova.infra.adapter.network.packets.outgoing.wired;

import com.nova.infra.adapter.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record WiredSaveSuccessMessage(
    // No fields parsed
) implements IOutgoingPacket {}
