package com.nova.infra.adapter.network.packets.outgoing.user;

import com.nova.infra.adapter.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record UserProfileMessage(
    int id,
    String username,
    String figure,
    String motto,
    String registration,
    int achievementPoints,
    int friendsCount,
    boolean isMyFriend,
    boolean requestSent,
    boolean isOnline
) implements IOutgoingPacket {}
