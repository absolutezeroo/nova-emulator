package com.nova.infra.adapter.in.network.packets.outgoing.misc;

import com.nova.infra.adapter.in.network.packets.IOutgoingPacket;

/**
 * Response message containing a generated machine ID for the client to store.
 */
public record UniqueMachineIDMessage(
    String machineId
) implements IOutgoingPacket {}
