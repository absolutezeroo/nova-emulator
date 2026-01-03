package com.nova.infra.adapter.network.packets.incoming.talent;

import com.nova.infra.adapter.network.packets.IIncomingPacket;

/**
 * Event received from client.
 */
public record GetTalentTrackLevelMessageEvent(
    // No fields parsed
) implements IIncomingPacket {}
