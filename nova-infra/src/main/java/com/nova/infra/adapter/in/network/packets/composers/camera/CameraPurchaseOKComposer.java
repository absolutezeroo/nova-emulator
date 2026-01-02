package com.nova.infra.adapter.in.network.packets.composers.camera;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.camera.CameraPurchaseOKMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes CameraPurchaseOK packet for client.
 */
@ComposesPacket(Outgoing.CAMERA_PURCHASE_OK)
public class CameraPurchaseOKComposer extends PacketComposer<CameraPurchaseOKMessage> {
@Override
    protected void write(PacketBuffer packet, CameraPurchaseOKMessage message) {
        // No fields to write
    }
}
