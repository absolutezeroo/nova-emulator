package com.nova.infra.adapter.network.packets.outgoing.camera;

import com.nova.infra.adapter.network.packets.OutgoingPacket;

/**
 * Message sent to client.
 */
public record CameraSnapshotMessage(
    String roomType,
    int roomId
) implements OutgoingPacket {}
