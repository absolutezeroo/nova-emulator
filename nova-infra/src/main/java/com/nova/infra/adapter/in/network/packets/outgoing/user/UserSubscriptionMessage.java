package com.nova.infra.adapter.in.network.packets.outgoing.user;

import com.nova.infra.adapter.in.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record UserSubscriptionMessage(
    String productName,
    int daysToPeriodEnd,
    int memberPeriods,
    int periodsSubscribedAhead,
    int responseType,
    boolean hasEverBeenMember,
    boolean isVip,
    int pastClubDays,
    int pastVipDays,
    int minutesUntilExpiration,
    int minutesSinceLastModified
) implements IOutgoingPacket {}
