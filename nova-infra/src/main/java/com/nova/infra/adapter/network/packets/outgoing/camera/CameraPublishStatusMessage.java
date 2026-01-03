package com.nova.infra.adapter.network.packets.outgoing.camera;

import com.nova.infra.adapter.network.packets.OutgoingPacket;

/**
 * Message sent to client.
 */
public record CameraPublishStatusMessage(
    boolean ok,
    int secondsToWait,
    String extraDataId
) implements OutgoingPacket {}
