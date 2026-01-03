package com.nova.infra.adapter.network.packets.outgoing.guide;

import com.nova.infra.adapter.network.packets.OutgoingPacket;

/**
 * Message sent to client.
 */
public record GuideOnDutyStatusMessage(
    boolean onDuty,
    int guidesOnDuty,
    int helpersOnDuty,
    int guardiansOnDuty
) implements OutgoingPacket {}
