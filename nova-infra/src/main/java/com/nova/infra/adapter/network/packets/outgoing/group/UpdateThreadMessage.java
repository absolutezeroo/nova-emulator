package com.nova.infra.adapter.network.packets.outgoing.group;

import com.nova.infra.adapter.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record UpdateThreadMessage(
    int groupId
) implements IOutgoingPacket {}
