package com.nova.infra.adapter.network.packets.outgoing.guide;

import com.nova.infra.adapter.network.packets.OutgoingPacket;

/**
 * Message sent to client.
 */
public record GuideTicketCreationResultMessage(
    int result
) implements OutgoingPacket {}
