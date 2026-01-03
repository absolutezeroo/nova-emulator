package com.nova.infra.adapter.network.packets.outgoing.misc;

import com.nova.infra.adapter.network.packets.OutgoingPacket;

/**
 * Message sent to client.
 */
public record CampaignCalendarDoorOpenedMessage(
    boolean doorOpened,
    String productName,
    String customImage,
    String furnitureClassName
) implements OutgoingPacket {}
