package com.nova.infra.adapter.in.network.packets.outgoing.catalog;

import com.nova.infra.adapter.in.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record ClubGiftSelectedMessage(
    String productCode
) implements IOutgoingPacket {}
