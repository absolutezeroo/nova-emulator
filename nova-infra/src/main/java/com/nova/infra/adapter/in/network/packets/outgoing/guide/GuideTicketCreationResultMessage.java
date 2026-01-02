package com.nova.infra.adapter.in.network.packets.outgoing.guide;

import com.nova.infra.adapter.in.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record GuideTicketCreationResultMessage(
    int result
) implements IOutgoingPacket {}
