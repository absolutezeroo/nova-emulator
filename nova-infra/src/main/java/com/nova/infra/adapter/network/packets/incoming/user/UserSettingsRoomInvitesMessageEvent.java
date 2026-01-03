package com.nova.infra.adapter.network.packets.incoming.user;

import com.nova.infra.adapter.network.packets.IncomingPacket;

/**
 * Event received from client.
 */
public record UserSettingsRoomInvitesMessageEvent(
    // No fields parsed
) implements IncomingPacket {}
