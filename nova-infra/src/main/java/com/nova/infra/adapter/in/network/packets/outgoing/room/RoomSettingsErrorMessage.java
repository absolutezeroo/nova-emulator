package com.nova.infra.adapter.in.network.packets.outgoing.room;

import com.nova.infra.adapter.in.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record RoomSettingsErrorMessage(
    int roomId,
    int code
) implements IOutgoingPacket {}
