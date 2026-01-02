package com.nova.infra.adapter.in.network.packets.outgoing.misc;

import com.nova.infra.adapter.in.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record TryPhoneNumberResultMessage(
    int resultCode,
    int millisToAllowProcessReset
) implements IOutgoingPacket {}
