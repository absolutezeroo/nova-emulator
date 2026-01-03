package com.nova.infra.adapter.network.packets.incoming.misc;

import com.nova.infra.adapter.network.packets.IIncomingPacket;

/**
 * Event received from client.
 */
public record CloseIssueDefaultActionMessageEvent(
    // No fields parsed
) implements IIncomingPacket {}
