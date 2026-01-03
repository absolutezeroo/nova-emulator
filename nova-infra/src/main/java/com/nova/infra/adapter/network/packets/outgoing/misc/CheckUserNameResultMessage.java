package com.nova.infra.adapter.network.packets.outgoing.misc;

import com.nova.infra.adapter.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record CheckUserNameResultMessage(
    int resultCode,
    String name
) implements IOutgoingPacket {}
