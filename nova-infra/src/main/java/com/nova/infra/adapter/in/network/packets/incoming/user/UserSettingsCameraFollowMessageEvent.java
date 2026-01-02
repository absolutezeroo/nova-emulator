package com.nova.infra.adapter.in.network.packets.incoming.user;

import com.nova.infra.adapter.in.network.packets.IIncomingPacket;

/**
 * Event received from client.
 */
public record UserSettingsCameraFollowMessageEvent(
    // No fields parsed
) implements IIncomingPacket {}
