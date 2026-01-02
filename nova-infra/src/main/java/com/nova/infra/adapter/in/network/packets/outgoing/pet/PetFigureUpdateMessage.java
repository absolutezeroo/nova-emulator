package com.nova.infra.adapter.in.network.packets.outgoing.pet;

import com.nova.infra.adapter.in.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record PetFigureUpdateMessage(
    int roomIndex,
    int petId,
    boolean hasSaddle,
    boolean isRiding
) implements IOutgoingPacket {}
