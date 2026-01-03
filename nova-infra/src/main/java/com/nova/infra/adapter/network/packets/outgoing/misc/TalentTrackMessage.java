package com.nova.infra.adapter.network.packets.outgoing.misc;

import com.nova.infra.adapter.network.packets.OutgoingPacket;

/**
 * Message sent to client.
 */
public record TalentTrackMessage(
    String talentTrackName,
    int level,
    int maxLevel
) implements OutgoingPacket {}
