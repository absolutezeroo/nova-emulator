package com.nova.infra.adapter.network.packets.outgoing.room;

import com.nova.infra.adapter.network.packets.OutgoingPacket;

/**
 * Message sent to client.
 */
public record RoomSettingsSaveErrorMessage(
    int roomId,
    int code,
    String message
) implements OutgoingPacket {}
