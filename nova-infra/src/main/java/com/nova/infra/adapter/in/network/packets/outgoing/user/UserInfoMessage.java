package com.nova.infra.adapter.in.network.packets.outgoing.user;

import com.nova.infra.adapter.in.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record UserInfoMessage(
    int userId,
    String username,
    String figure,
    String gender,
    String motto,
    String realName,
    boolean directMail,
    int respectsReceived,
    int respectsRemaining,
    int respectsPetRemaining,
    boolean streamPublishingAllowed,
    String lastAccessDate,
    boolean canChangeName,
    boolean safetyLocked
) implements IOutgoingPacket {}
