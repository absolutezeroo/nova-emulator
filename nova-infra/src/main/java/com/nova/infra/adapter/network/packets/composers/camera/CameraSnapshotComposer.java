package com.nova.infra.adapter.network.packets.composers.camera;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.camera.CameraSnapshotMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes CameraSnapshot packet for client.
 */
@ComposesPacket(Outgoing.CAMERA_SNAPSHOT)
public class CameraSnapshotComposer extends PacketComposer<CameraSnapshotMessage> {
@Override
    protected void write(PacketBuffer packet, CameraSnapshotMessage message) {
        packet.appendString(message.roomType());
        packet.appendInt(message.roomId());
    }
}
