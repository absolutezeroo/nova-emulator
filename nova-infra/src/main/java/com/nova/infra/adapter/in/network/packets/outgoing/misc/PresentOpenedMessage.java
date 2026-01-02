package com.nova.infra.adapter.in.network.packets.outgoing.misc;

import com.nova.infra.adapter.in.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record PresentOpenedMessage(
    String itemType,
    int classId,
    String productCode,
    int placedItemId,
    String placedItemType,
    boolean placedInRoom,
    String petFigureString
) implements IOutgoingPacket {}
