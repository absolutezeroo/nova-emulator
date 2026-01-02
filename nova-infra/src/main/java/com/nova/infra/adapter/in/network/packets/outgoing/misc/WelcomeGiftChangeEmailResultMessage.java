package com.nova.infra.adapter.in.network.packets.outgoing.misc;

import com.nova.infra.adapter.in.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record WelcomeGiftChangeEmailResultMessage(
    int result
) implements IOutgoingPacket {}
