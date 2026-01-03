package com.nova.infra.adapter.network.packets.outgoing.messenger;

import com.nova.infra.adapter.network.packets.OutgoingPacket;

/**
 * Message sent to client.
 */
public record FindFriendsProcessResultMessage(
    boolean success
) implements OutgoingPacket {}
