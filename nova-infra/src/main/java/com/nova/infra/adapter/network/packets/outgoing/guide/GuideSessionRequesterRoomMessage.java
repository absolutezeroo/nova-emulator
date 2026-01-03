package com.nova.infra.adapter.network.packets.outgoing.guide;

import com.nova.infra.adapter.network.packets.OutgoingPacket;

/**
 * Message sent to client.
 */
public record GuideSessionRequesterRoomMessage(
    int requesterRoomId
) implements OutgoingPacket {}
