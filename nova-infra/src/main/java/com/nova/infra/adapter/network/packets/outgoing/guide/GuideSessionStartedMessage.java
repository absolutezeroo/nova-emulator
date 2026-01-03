package com.nova.infra.adapter.network.packets.outgoing.guide;

import com.nova.infra.adapter.network.packets.IOutgoingPacket;

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
) implements IOutgoingPacket {}
