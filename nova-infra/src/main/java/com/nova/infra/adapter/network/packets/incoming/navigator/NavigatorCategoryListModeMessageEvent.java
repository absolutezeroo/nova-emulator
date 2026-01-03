package com.nova.infra.adapter.network.packets.incoming.navigator;

import com.nova.infra.adapter.network.packets.IIncomingPacket;

/**
 * Event received from client.
 */
public record NavigatorCategoryListModeMessageEvent(
    // No fields parsed
) implements IIncomingPacket {}
