package com.nova.infra.adapter.network.packets.outgoing.competition;

import com.nova.infra.adapter.network.packets.OutgoingPacket;

/**
 * Message sent to client.
 */
public record NoOwnedRoomsAlertMessage(
    // No fields parsed
) implements OutgoingPacket {}
