package com.nova.infra.adapter.network.packets.outgoing.navigator;

import com.nova.infra.adapter.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record NavigatorSettingsMessage(
    int windowX,
    int windowY,
    int windowWidth,
    int windowHeight,
    boolean leftPanelHidden,
    int resultsMode
) implements IOutgoingPacket {}
