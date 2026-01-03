package com.nova.infra.adapter.network.packets.annotations;

import com.nova.infra.adapter.network.packets.IncomingPacket;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Marks a PacketHandler class and specifies which event type it handles.
 * <p>
 * Used for automatic handler registration at startup via classpath scanning.
 * Handlers annotated with this will be instantiated via Guice (supporting @Inject).
 *
 * <pre>
 * {@code
 * @HandlesPacket(SSOTicketMessageEvent.class)
 * public class SsoTicketHandler implements PacketHandler<SSOTicketMessageEvent> {
 *
 *     @Inject
 *     public SsoTicketHandler(UserUseCase userUseCase, PacketComposerManager composerManager) {
 *         this.userUseCase = userUseCase;
 *         this.composerManager = composerManager;
 *     }
 *
 *     @Override
 *     public void handle(NetworkConnection connection, SSOTicketMessageEvent packet) {
 *         // Business logic
 *     }
 * }
 * }
 * </pre>
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface HandlesPacket {

    /**
     * The incoming packet event class this handler processes.
     *
     * @return the event class type
     */
    Class<? extends IncomingPacket> value();
}
