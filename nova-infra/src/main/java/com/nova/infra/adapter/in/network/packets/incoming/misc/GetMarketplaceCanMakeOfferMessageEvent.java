package com.nova.infra.adapter.in.network.packets.incoming.misc;

import com.nova.infra.adapter.in.network.packets.IIncomingPacket;

/**
 * Event received from client.
 */
public record GetMarketplaceCanMakeOfferMessageEvent(
    // No fields parsed
) implements IIncomingPacket {}
