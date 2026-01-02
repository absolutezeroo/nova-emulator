package com.nova.infra.adapter.in.network.packets.parsers;

import com.nova.core.domain.port.out.network.NetworkConnection;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.IIncomingPacket;

/**
 * Abstract base class for parsing incoming client packets.
 * <p>
 * Parsers are responsible for reading binary data from ClientMessage
 * and converting it into typed packet event objects.
 * <p>
 * Each parser handles a specific packet ID and produces a specific
 * event type that can be processed by a corresponding handler.
 *
 * @param <T> the type of incoming packet event this parser produces
 */
public abstract class PacketParser<T extends IIncomingPacket> {

    /**
     * Gets the packet ID this parser handles.
     *
     * @return the incoming packet header ID
     */
    public abstract int getPacketId();

    /**
     * Parses raw binary data into a typed packet event.
     *
     * @param connection the client connection
     * @param message    the raw client message containing binary data
     * @return the parsed packet event
     */
    public abstract T parse(NetworkConnection connection, ClientMessage message);
}
