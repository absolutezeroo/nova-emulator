package com.nova.infra.adapter.network.packets.incoming.misc;

import com.nova.infra.adapter.network.packets.IIncomingPacket;

/**
 * Machine ID packet received from client for hardware identification.
 */
public record UniqueIDMessageEvent(
    String machineId,
    String fingerprint,
    String flashVersion
) implements IIncomingPacket {}
