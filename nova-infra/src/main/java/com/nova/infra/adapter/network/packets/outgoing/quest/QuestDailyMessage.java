package com.nova.infra.adapter.network.packets.outgoing.quest;

import com.nova.infra.adapter.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record QuestDailyMessage(
    int easyQuestCount,
    int hardQuestCount
) implements IOutgoingPacket {}
