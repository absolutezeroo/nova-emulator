package com.nova.infra.adapter.network.packets.outgoing.quest;

import com.nova.infra.adapter.network.packets.OutgoingPacket;

/**
 * Message sent to client.
 */
public record QuestCancelledMessage(
    boolean expired
) implements OutgoingPacket {}
