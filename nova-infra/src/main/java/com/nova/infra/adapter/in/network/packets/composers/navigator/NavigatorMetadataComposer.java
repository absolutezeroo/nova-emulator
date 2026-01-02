package com.nova.infra.adapter.in.network.packets.composers.navigator;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.navigator.NavigatorMetadataMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes NavigatorMetadata packet for client.
 */
@ComposesPacket(Outgoing.NAVIGATOR_METADATA)
public class NavigatorMetadataComposer extends PacketComposer<NavigatorMetadataMessage> {
@Override
    protected void write(PacketBuffer packet, NavigatorMetadataMessage message) {
        // No fields to write
    }
}
