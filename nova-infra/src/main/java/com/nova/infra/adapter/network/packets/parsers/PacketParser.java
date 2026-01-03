package com.nova.infra.adapter.network.packets.parsers;

import com.nova.infra.adapter.network.packets.IIncomingPacket;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;
import com.nova.infra.adapter.network.codec.ClientMessage;

/**
 * Abstract base class for packet parsers.
 * Parses raw ClientMessage bytes into typed event objects.
 * <p>
 * Parsers should be annotated with {@link ParsesPacket} to specify their header ID:
 * <pre>
 * {@code
 * @ParsesPacket(Incoming.SECURITY_TICKET)
 * public class SSOTicketParser extends PacketParser<SSOTicketMessageEvent> {
 *     @Override
 *     public SSOTicketMessageEvent parse(ClientMessage message) {
 *         return new SSOTicketMessageEvent(message.readString());
 *     }
 * }
 * }
 * </pre>
 *
 * @param <T> The type of incoming packet this parser produces
 */
public abstract class PacketParser<T extends IIncomingPacket> {

    private final int headerId;

    /**
     * Creates a parser, reading the header ID from the {@link ParsesPacket} annotation.
     *
     * @throws IllegalStateException if the annotation is missing
     */
    protected PacketParser() {
        ParsesPacket annotation = this.getClass().getAnnotation(ParsesPacket.class);
        if (annotation != null) {
            this.headerId = annotation.value();
        } else {
            // Fallback for backwards compatibility during migration
            this.headerId = getHeaderIdLegacy();
        }
    }

    /**
     * Returns the header ID this parser handles.
     *
     * @return The packet header ID
     */
    public final int getHeaderId() {
        return headerId;
    }

    /**
     * Legacy method for backwards compatibility.
     * Override this if not using the {@link ParsesPacket} annotation.
     *
     * @return The packet header ID
     * @deprecated Use {@link ParsesPacket} annotation instead
     */
    @Deprecated
    protected int getHeaderIdLegacy() {
        throw new IllegalStateException(
                "Parser " + getClass().getName() + " must be annotated with @ParsesPacket");
    }

    /**
     * Parses the raw message into a typed event object.
     *
     * @param message The raw client message
     * @return The parsed event object
     */
    public abstract T parse(ClientMessage message);
}
