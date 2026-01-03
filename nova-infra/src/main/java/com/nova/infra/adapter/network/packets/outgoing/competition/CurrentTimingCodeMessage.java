package com.nova.infra.adapter.network.packets.outgoing.competition;

import com.nova.infra.adapter.network.packets.OutgoingPacket;

/**
 * Message sent to client.
 */
public record CurrentTimingCodeMessage(
    String schedulingStr,
    String code
) implements OutgoingPacket {}
