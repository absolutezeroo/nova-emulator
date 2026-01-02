package com.nova.infra.adapter.in.network.packets.incoming.misc;

import com.nova.infra.adapter.in.network.packets.IIncomingPacket;

/**
 * Event received from client.
 */
public record RedeemCommunityGoalPrizeMessageEvent(
    // No fields parsed
) implements IIncomingPacket {}
