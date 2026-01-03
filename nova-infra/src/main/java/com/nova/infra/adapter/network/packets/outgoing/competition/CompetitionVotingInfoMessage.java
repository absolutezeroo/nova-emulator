package com.nova.infra.adapter.network.packets.outgoing.competition;

import com.nova.infra.adapter.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record CompetitionVotingInfoMessage(
    int goalId,
    String goalCode,
    int resultCode,
    int votesRemaining
) implements IOutgoingPacket {}
