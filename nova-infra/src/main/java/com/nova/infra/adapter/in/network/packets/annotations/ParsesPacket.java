package com.nova.infra.adapter.in.network.packets.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Marks a PacketParser class and specifies which header ID it handles.
 * <p>
 * Used for automatic parser registration at startup via classpath scanning.
 * Replaces the manual registration in PacketRegistry.
 *
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
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ParsesPacket {

    /**
     * The incoming packet header ID this parser handles.
     * Use constants from {@link com.nova.infra.adapter.in.network.packets.headers.Incoming}.
     *
     * @return the header ID
     */
    int value();
}
