package com.nova.infra.adapter.in.network.packets.outgoing.group;

import com.nova.infra.adapter.in.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record GroupInformationMessage(
    int id,
    int type,
    String title,
    String description,
    String badge,
    int roomId,
    String roomName,
    int membershipType,
    int membersCount,
    boolean isFavorite,
    String createdAt,
    boolean isOwner,
    boolean isAdmin,
    String ownerName,
    boolean flag,
    boolean canMembersDecorate,
    int pendingRequestsCount
) implements IOutgoingPacket {}
