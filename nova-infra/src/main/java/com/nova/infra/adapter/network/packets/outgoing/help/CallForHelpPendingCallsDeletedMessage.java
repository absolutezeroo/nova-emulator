package com.nova.infra.adapter.network.packets.outgoing.help;

import com.nova.infra.adapter.network.packets.OutgoingPacket;

/**
 * Message sent to client.
 */
public record CallForHelpPendingCallsDeletedMessage(
    // No fields parsed
) implements OutgoingPacket {}
