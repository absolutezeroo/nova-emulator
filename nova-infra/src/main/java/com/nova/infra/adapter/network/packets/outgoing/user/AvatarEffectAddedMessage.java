package com.nova.infra.adapter.network.packets.outgoing.user;

import com.nova.infra.adapter.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record AvatarEffectAddedMessage(
    int type,
    int subType,
    int duration,
    boolean permanent
) implements IOutgoingPacket {}
