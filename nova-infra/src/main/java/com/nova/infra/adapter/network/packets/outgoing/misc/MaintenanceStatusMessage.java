package com.nova.infra.adapter.network.packets.outgoing.misc;

import com.nova.infra.adapter.network.packets.OutgoingPacket;

/**
 * Message sent to client.
 */
public record MaintenanceStatusMessage(
    boolean isInMaintenance,
    int minutesUntilMaintenance,
    int duration
) implements OutgoingPacket {}
