package com.nova.infra.adapter.in.network.packets.outgoing.quest;

import com.nova.infra.adapter.in.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record QuestionMessage(
    // No fields parsed
) implements IOutgoingPacket {}
