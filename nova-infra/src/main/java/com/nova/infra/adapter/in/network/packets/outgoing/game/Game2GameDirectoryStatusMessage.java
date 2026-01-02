package com.nova.infra.adapter.in.network.packets.outgoing.game;

import com.nova.infra.adapter.in.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record Game2GameDirectoryStatusMessage(
    int status,
    int blockLength,
    int gamesPlayed,
    int freeGamesLeft
) implements IOutgoingPacket {}
