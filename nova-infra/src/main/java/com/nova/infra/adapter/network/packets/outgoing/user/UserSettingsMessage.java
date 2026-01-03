package com.nova.infra.adapter.network.packets.outgoing.user;

import com.nova.infra.adapter.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record UserSettingsMessage(
    int volumeSystem,
    int volumeFurni,
    int volumeTrax,
    boolean oldChat,
    boolean roomInvites,
    boolean cameraFollow,
    int flags,
    int chatType
) implements IOutgoingPacket {}
