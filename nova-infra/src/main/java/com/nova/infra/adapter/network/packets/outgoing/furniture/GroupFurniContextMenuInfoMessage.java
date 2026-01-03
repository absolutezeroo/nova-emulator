package com.nova.infra.adapter.network.packets.outgoing.furniture;

import com.nova.infra.adapter.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record GroupFurniContextMenuInfoMessage(
    int objectId,
    int guildId,
    String guildName,
    int guildHomeRoomId,
    boolean userIsMember,
    boolean guildHasReadableForum
) implements IOutgoingPacket {}
