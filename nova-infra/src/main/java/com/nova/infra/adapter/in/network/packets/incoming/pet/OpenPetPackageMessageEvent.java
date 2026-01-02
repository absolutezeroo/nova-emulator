package com.nova.infra.adapter.in.network.packets.incoming.pet;

import com.nova.infra.adapter.in.network.packets.IIncomingPacket;

/**
 * Event received from client.
 */
public record OpenPetPackageMessageEvent(
    // No fields parsed
) implements IIncomingPacket {}
