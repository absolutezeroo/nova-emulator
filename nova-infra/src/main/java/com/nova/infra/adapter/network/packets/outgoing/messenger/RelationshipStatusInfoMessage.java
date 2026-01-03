package com.nova.infra.adapter.network.packets.outgoing.messenger;

import com.nova.infra.adapter.network.packets.OutgoingPacket;

/**
 * Message sent to client.
 */
public record RelationshipStatusInfoMessage(
    int relationshipStatusType,
    int friendCount,
    int randomFriendId,
    String randomFriendName,
    String randomFriendFigure
) implements OutgoingPacket {}
