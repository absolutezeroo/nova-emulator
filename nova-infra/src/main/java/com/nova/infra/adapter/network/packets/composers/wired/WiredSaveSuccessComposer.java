package com.nova.infra.adapter.network.packets.composers.wired;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.wired.WiredSaveSuccessMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes WiredSaveSuccess packet for client.
 */
@ComposesPacket(Outgoing.WIRED_SAVE)
public class WiredSaveSuccessComposer extends PacketComposer<WiredSaveSuccessMessage> {
@Override
    protected void write(PacketBuffer packet, WiredSaveSuccessMessage message) {
        // No fields to write
    }
}
