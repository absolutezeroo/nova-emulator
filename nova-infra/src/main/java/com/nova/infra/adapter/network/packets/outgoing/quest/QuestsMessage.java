package com.nova.infra.adapter.network.packets.outgoing.quest;

import com.nova.infra.adapter.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record QuestsMessage(
    // No fields parsed
) implements IOutgoingPacket {}
