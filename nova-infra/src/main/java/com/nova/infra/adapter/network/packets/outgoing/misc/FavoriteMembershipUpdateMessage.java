package com.nova.infra.adapter.network.packets.outgoing.misc;

import com.nova.infra.adapter.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record FavoriteMembershipUpdateMessage(
    int roomIndex,
    int groupId,
    int status,
    String groupName
) implements IOutgoingPacket {}
