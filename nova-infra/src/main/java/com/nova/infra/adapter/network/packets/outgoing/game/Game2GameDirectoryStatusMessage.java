package com.nova.infra.adapter.network.packets.outgoing.game;

import com.nova.infra.adapter.network.packets.OutgoingPacket;

/**
 * Message sent to client.
 */
public record Game2GameDirectoryStatusMessage(
    int status,
    int blockLength,
    int gamesPlayed,
    int freeGamesLeft
) implements OutgoingPacket {}
