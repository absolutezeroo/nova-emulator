package com.nova.infra.adapter.network.packets.outgoing.misc;

import com.nova.infra.adapter.network.packets.OutgoingPacket;

/**
 * Message sent to client.
 */
public record HotelClosesAndWillOpenAtMessage(
    int openHour,
    int openMinute,
    boolean userThrownOutAtClose
) implements OutgoingPacket {}
