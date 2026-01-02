package com.nova.infra.adapter.in.network.packets.outgoing.camera;

import com.nova.infra.adapter.in.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record CameraPurchaseOKMessage(
    // No fields parsed
) implements IOutgoingPacket {}
