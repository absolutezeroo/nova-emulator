package com.nova.infra.adapter.network.packets.outgoing.help;

import com.nova.infra.adapter.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record CfhSanctionMessage(
    int issueId,
    int accountId
) implements IOutgoingPacket {}
