package com.nova.infra.adapter.in.network.packets.outgoing.quest;

import com.nova.infra.adapter.in.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record QuestCancelledMessage(
    boolean expired
) implements IOutgoingPacket {}
