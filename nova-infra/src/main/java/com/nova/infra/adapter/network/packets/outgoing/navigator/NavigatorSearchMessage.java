package com.nova.infra.adapter.network.packets.outgoing.navigator;

import com.nova.infra.adapter.network.packets.OutgoingPacket;

/**
 * Message sent to client.
 */
public record NavigatorSearchMessage(
    String code,
    String data,
    int action,
    boolean closed,
    int mode
) implements OutgoingPacket {}
