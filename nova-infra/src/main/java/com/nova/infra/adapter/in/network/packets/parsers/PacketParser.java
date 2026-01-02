package com.nova.infra.adapter.in.network.packets.parsers;

import com.nova.infra.adapter.in.network.packets.IIncomingPacket;
import com.nova.infra.adapter.in.network.codec.ClientMessage;

/**
 * Abstract base class for packet parsers.
 * Parses raw ClientMessage bytes into typed event objects.
 *
 * @param <T> The type of incoming packet this parser produces
 */
public abstract class PacketParser<T extends IIncomingPacket> {

    /**
     * Returns the header ID this parser handles.
     *
     * @return The packet header ID
     */
    public abstract int getHeaderId();

    /**
     * Parses the raw message into a typed event object.
     *
     * @param message The raw client message
     * @return The parsed event object
     */
    public abstract T parse(ClientMessage message);
}
