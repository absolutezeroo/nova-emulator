package com.nova.infra.adapter.network.packets.outgoing.competition;

import com.nova.infra.adapter.network.packets.OutgoingPacket;

/**
 * Message sent to client.
 */
public record IsUserPartOfCompetitionMessage(
    boolean isPartOf,
    int targetId
) implements OutgoingPacket {}
