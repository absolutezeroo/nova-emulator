package com.nova.infra.adapter.in.network.packets.composers.camera;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.camera.CameraPublishStatusMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes CameraPublishStatus packet for client.
 */
@ComposesPacket(Outgoing.CAMERA_PUBLISH_STATUS)
public class CameraPublishStatusComposer extends PacketComposer<CameraPublishStatusMessage> {
@Override
    protected void write(PacketBuffer packet, CameraPublishStatusMessage message) {
        packet.appendBoolean(message.ok());
        packet.appendInt(message.secondsToWait());
        packet.appendString(message.extraDataId());
    }
}
