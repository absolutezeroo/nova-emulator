package com.nova.infra.adapter.in.network.packets.incoming.navigator;

import com.nova.infra.adapter.in.network.packets.IIncomingPacket;

/**
 * Event received from client.
 */
public record NavigatorSettingsSaveMessageEvent(
    // No fields parsed
) implements IIncomingPacket {}
