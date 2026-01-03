package com.nova.infra.adapter.network.packets.outgoing.camera;

import com.nova.infra.adapter.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record CameraStorageUrlMessage(
    String url
) implements IOutgoingPacket {}
