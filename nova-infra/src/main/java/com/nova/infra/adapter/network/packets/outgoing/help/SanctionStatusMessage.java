package com.nova.infra.adapter.network.packets.outgoing.help;

import com.nova.infra.adapter.network.packets.OutgoingPacket;

/**
 * Message sent to client.
 */
public record SanctionStatusMessage(
    boolean isSanctionNew,
    boolean isSanctionActive,
    String sanctionName,
    int sanctionLengthHours,
    String sanctionReason,
    String sanctionCreationTime,
    int probationHoursLeft,
    String nextSanctionName,
    int nextSanctionLengthHours,
    boolean hasCustomMute,
    String tradeLockExpiryTime
) implements OutgoingPacket {}
