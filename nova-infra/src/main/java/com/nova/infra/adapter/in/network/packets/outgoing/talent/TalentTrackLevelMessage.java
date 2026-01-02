package com.nova.infra.adapter.in.network.packets.outgoing.talent;

import com.nova.infra.adapter.in.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record TalentTrackLevelMessage(
    String talentTrackName,
    int level,
    int maxLevel
) implements IOutgoingPacket {}
