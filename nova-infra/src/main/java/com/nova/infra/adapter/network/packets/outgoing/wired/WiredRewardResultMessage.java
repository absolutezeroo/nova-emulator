package com.nova.infra.adapter.network.packets.outgoing.wired;

import com.nova.infra.adapter.network.packets.OutgoingPacket;

/**
 * Message sent to client.
 */
public record WiredRewardResultMessage(
    int reason
) implements OutgoingPacket {}
