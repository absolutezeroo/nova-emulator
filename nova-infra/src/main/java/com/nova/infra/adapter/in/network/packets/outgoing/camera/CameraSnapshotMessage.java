package com.nova.infra.adapter.in.network.packets.outgoing.camera;

import com.nova.infra.adapter.in.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record CameraSnapshotMessage(
    String roomType,
    int roomId
) implements IOutgoingPacket {}
