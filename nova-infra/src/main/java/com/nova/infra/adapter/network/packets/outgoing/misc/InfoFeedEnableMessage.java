package com.nova.infra.adapter.network.packets.outgoing.misc;

import com.nova.infra.adapter.network.packets.OutgoingPacket;

/**
 * Message sent to client.
 */
public record InfoFeedEnableMessage(
    boolean enabled
) implements OutgoingPacket {}
