package com.nova.infra.adapter.in.network.packets.outgoing.guide;

import com.nova.infra.adapter.in.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record GuideOnDutyStatusMessage(
    boolean onDuty,
    int guidesOnDuty,
    int helpersOnDuty,
    int guardiansOnDuty
) implements IOutgoingPacket {}
