package com.nova.infra.adapter.network.packets.outgoing.room;

import com.nova.infra.adapter.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record GetGuestRoomResultMessage(
    boolean roomEnter,
    boolean roomForward,
    boolean staffPick,
    boolean isGroupMember
) implements IOutgoingPacket {}
