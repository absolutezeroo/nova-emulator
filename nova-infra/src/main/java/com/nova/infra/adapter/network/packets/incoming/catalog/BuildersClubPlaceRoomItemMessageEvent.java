package com.nova.infra.adapter.network.packets.incoming.catalog;

import com.nova.infra.adapter.network.packets.IIncomingPacket;

/**
 * Event received from client.
 */
public record BuildersClubPlaceRoomItemMessageEvent(
    // No fields parsed
) implements IIncomingPacket {}
