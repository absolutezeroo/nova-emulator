package com.nova.infra.adapter.in.network.packets.outgoing.help;

import com.nova.infra.adapter.in.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record CallForHelpPendingCallsDeletedMessage(
    // No fields parsed
) implements IOutgoingPacket {}
