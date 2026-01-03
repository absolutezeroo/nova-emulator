package com.nova.infra.adapter.network.packets.composers.navigator;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.navigator.NavigatorSettingsMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes NavigatorSettings packet for client.
 */
@ComposesPacket(Outgoing.NAVIGATOR_SETTINGS)
public class NavigatorSettingsComposer extends PacketComposer<NavigatorSettingsMessage> {
@Override
    protected void write(PacketBuffer packet, NavigatorSettingsMessage message) {
        packet.appendInt(message.windowX());
        packet.appendInt(message.windowY());
        packet.appendInt(message.windowWidth());
        packet.appendInt(message.windowHeight());
        packet.appendBoolean(message.leftPanelHidden());
        packet.appendInt(message.resultsMode());
    }
}
