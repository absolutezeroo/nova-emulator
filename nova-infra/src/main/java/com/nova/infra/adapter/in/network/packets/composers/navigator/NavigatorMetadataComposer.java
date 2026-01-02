package com.nova.infra.adapter.in.network.packets.composers.navigator;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.navigator.NavigatorMetadataMessage;

/**
 * Composes NavigatorMetadata packet for client.
 */
public class NavigatorMetadataComposer extends PacketComposer<NavigatorMetadataMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.NAVIGATOR_METADATA;
    }

    @Override
    protected void write(PacketBuffer packet, NavigatorMetadataMessage message) {
        // No fields to write
    }
}
