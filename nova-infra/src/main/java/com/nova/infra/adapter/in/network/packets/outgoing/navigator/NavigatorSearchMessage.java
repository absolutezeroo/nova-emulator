package com.nova.infra.adapter.in.network.packets.outgoing.navigator;

import com.nova.infra.adapter.in.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record NavigatorSearchMessage(
    String code,
    String data,
    int action,
    boolean closed,
    int mode
) implements IOutgoingPacket {}
