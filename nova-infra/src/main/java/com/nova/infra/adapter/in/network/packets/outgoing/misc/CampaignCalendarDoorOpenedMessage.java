package com.nova.infra.adapter.in.network.packets.outgoing.misc;

import com.nova.infra.adapter.in.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record CampaignCalendarDoorOpenedMessage(
    boolean doorOpened,
    String productName,
    String customImage,
    String furnitureClassName
) implements IOutgoingPacket {}
