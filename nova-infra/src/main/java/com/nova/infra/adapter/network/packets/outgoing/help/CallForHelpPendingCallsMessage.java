package com.nova.infra.adapter.network.packets.outgoing.help;

import com.nova.infra.adapter.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record CallForHelpPendingCallsMessage(
    // No fields parsed
) implements IOutgoingPacket {}
