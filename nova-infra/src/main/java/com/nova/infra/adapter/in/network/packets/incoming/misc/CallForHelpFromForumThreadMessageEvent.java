package com.nova.infra.adapter.in.network.packets.incoming.misc;

import com.nova.infra.adapter.in.network.packets.IIncomingPacket;

/**
 * Event received from client.
 */
public record CallForHelpFromForumThreadMessageEvent(
    // No fields parsed
) implements IIncomingPacket {}
