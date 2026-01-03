package com.nova.infra.adapter.network.packets.outgoing.guide;

import com.nova.infra.adapter.network.packets.OutgoingPacket;

/**
 * Message sent to client.
 */
public record GuideSessionStartedMessage(
    int requesterUserId,
    String requesterName,
    String requesterFigure,
    int guideUserId,
    String guideName,
    String guideFigure
) implements OutgoingPacket {}
