package com.nova.infra.adapter.network.packets.annotations;

import com.nova.infra.adapter.network.packets.headers.Outgoing;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Marks a PacketComposer class and specifies which header ID it uses.
 * <p>
 * Used for automatic composer registration at startup via classpath scanning.
 * Replaces the manual registration in PacketRegistry.
 *
 * <pre>
 * {@code
 * @ComposesPacket(Outgoing.AUTHENTICATED)
 * public class AuthenticatedComposer extends PacketComposer<AuthenticatedMessage> {
 *     @Override
 *     protected void write(PacketBuffer packet, AuthenticatedMessage message) {
 *         // No fields to write
 *     }
 * }
 * }
 * </pre>
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ComposesPacket {

    /**
     * The outgoing packet header ID this composer uses.
     * Use constants from {@link Outgoing}.
     *
     * @return the header ID
     */
    int value();
}
