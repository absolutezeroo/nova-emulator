package com.nova.infra.adapter.in.network.packets.outgoing.competition;

import com.nova.infra.adapter.in.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record CurrentTimingCodeMessage(
    String schedulingStr,
    String code
) implements IOutgoingPacket {}
