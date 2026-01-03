package com.nova.infra.adapter.network.packets.outgoing.navigator;

import com.nova.infra.adapter.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record NavigatorLiftedMessage(
    int roomId,
    int areaId,
    String image,
    String caption
) implements IOutgoingPacket {}
