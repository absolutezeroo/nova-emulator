package com.nova.infra.adapter.in.network.packets.outgoing.messenger;

import com.nova.infra.adapter.in.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record FriendListFragmentMessage(
    int totalFragments,
    int fragmentNumber
) implements IOutgoingPacket {}
