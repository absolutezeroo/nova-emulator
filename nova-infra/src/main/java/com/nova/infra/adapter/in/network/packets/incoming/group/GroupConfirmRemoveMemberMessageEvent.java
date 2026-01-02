package com.nova.infra.adapter.in.network.packets.incoming.group;

import com.nova.infra.adapter.in.network.packets.IIncomingPacket;

/**
 * Event received from client.
 */
public record GroupConfirmRemoveMemberMessageEvent(
    // No fields parsed
) implements IIncomingPacket {}
