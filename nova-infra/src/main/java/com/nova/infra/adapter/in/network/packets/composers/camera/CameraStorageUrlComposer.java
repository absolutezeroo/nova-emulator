package com.nova.infra.adapter.in.network.packets.composers.camera;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.camera.CameraStorageUrlMessage;

/**
 * Composes CameraStorageUrl packet for client.
 */
public class CameraStorageUrlComposer extends PacketComposer<CameraStorageUrlMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.CAMERA_STORAGE_URL;
    }

    @Override
    protected void write(PacketBuffer packet, CameraStorageUrlMessage message) {
        packet.appendString(message.url());
    }
}
