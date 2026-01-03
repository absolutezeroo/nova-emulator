package com.nova.infra.adapter.network.packets.composers.camera;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.camera.CameraStorageUrlMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes CameraStorageUrl packet for client.
 */
@ComposesPacket(Outgoing.CAMERA_STORAGE_URL)
public class CameraStorageUrlComposer extends PacketComposer<CameraStorageUrlMessage> {
@Override
    protected void write(PacketBuffer packet, CameraStorageUrlMessage message) {
        packet.appendString(message.url());
    }
}
