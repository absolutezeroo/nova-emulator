package com.nova.infra.adapter.network.packets.outgoing.talent;

import com.nova.infra.adapter.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record TalentLevelUpMessage(
    String talentTrackName,
    int level
) implements IOutgoingPacket {}
