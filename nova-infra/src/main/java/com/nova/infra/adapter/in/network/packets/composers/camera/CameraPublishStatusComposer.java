package com.nova.infra.adapter.in.network.packets.composers.camera;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.camera.CameraPublishStatusMessage;

/**
 * Composes CameraPublishStatus packet for client.
 */
public class CameraPublishStatusComposer extends PacketComposer<CameraPublishStatusMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.CAMERA_PUBLISH_STATUS;
    }

    @Override
    protected void write(PacketBuffer packet, CameraPublishStatusMessage message) {
        packet.appendBoolean(message.ok());
        packet.appendInt(message.secondsToWait());
        packet.appendString(message.extraDataId());
    }
}
