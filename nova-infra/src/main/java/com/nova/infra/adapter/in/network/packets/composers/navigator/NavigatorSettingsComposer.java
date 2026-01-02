package com.nova.infra.adapter.in.network.packets.composers.navigator;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.navigator.NavigatorSettingsMessage;

/**
 * Composes NavigatorSettings packet for client.
 */
public class NavigatorSettingsComposer extends PacketComposer<NavigatorSettingsMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.NAVIGATOR_SETTINGS;
    }

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
