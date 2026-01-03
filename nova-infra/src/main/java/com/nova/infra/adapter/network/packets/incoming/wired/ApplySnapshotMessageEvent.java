package com.nova.infra.adapter.network.packets.incoming.wired;

import com.nova.infra.adapter.network.packets.IIncomingPacket;

/**
 * Event received from client.
 */
public record ApplySnapshotMessageEvent(
    // No fields parsed
) implements IIncomingPacket {}
