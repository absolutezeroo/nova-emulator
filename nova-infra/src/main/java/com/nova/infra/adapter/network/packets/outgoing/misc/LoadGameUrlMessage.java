package com.nova.infra.adapter.network.packets.outgoing.misc;

import com.nova.infra.adapter.network.packets.OutgoingPacket;

/**
 * Message sent to client.
 */
public record LoadGameUrlMessage(
    int gameTypeId,
    String gameClientId,
    String url
) implements OutgoingPacket {}
