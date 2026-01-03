package com.nova.infra.adapter.in.network.packets.composers;

import com.nova.infra.adapter.in.network.packets.IOutgoingPacket;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

/**
 * Registry of packet composers by message type.
 * Routes outgoing messages to the appropriate composer.
 */
public class PacketComposerManager {

    private static final Logger LOGGER = LoggerFactory.getLogger(PacketComposerManager.class);

    private final Map<Class<?>, PacketComposer<?>> composers = new HashMap<>();

    /**
     * Registers a composer, extracting the message type via reflection.
     * Used by PacketScanner for auto-registration.
     *
     * @param composer The composer to register
     */
    @SuppressWarnings("unchecked")
    public void register(PacketComposer<?> composer) {
        Class<?> messageType = extractMessageType(composer.getClass());
        if (messageType == null) {
            LOGGER.error("Cannot determine message type for composer: {}", composer.getClass().getName());
            return;
        }
        register((Class<IOutgoingPacket>) messageType, (PacketComposer<IOutgoingPacket>) composer);
    }

    /**
     * Registers a composer for a specific message type.
     *
     * @param messageType The message class this composer handles
     * @param composer    The composer to register
     * @param <T>         The message type
     */
    public <T extends IOutgoingPacket> void register(Class<T> messageType, PacketComposer<T> composer) {
        if (composers.containsKey(messageType)) {
            LOGGER.warn("Overwriting composer for message type: {}", messageType.getSimpleName());
        }

        composers.put(messageType, composer);
    }

    /**
     * Extracts the generic type parameter T from PacketComposer&lt;T&gt;.
     */
    private Class<?> extractMessageType(Class<?> composerClass) {
        Type type = composerClass.getGenericSuperclass();

        while (type != null) {
            if (type instanceof ParameterizedType pt) {
                Type rawType = pt.getRawType();

                if (rawType == PacketComposer.class) {
                    Type arg = pt.getActualTypeArguments()[0];

                    if (arg instanceof Class<?> cls) {
                        return cls;
                    }
                }
            }

            if (type instanceof Class<?> cls) {
                type = cls.getGenericSuperclass();
            } else {
                break;
            }
        }
        return null;
    }

    /**
     * Composes a packet from the given message using the registered composer.
     *
     * @param message The message to compose
     * @param <T>     The message type
     * @return The composed packet buffer, or null if no composer is registered
     */
    @SuppressWarnings("unchecked")
    public <T extends IOutgoingPacket> PacketBuffer compose(T message) {
        PacketComposer<T> composer = (PacketComposer<T>) composers.get(message.getClass());

        if (composer == null) {
            LOGGER.error("No composer registered for message type: {}", message.getClass().getSimpleName());

            return null;
        }

        try {
            return composer.compose(message);
        } catch (Exception e) {
            LOGGER.error("Error composing packet for message type: {}", message.getClass().getSimpleName(), e);

            return null;
        }
    }

    /**
     * Checks if a composer is registered for the given message type.
     *
     * @param messageType The message type to check
     * @return true if a composer is registered
     */
    public boolean hasComposer(Class<?> messageType) {
        return composers.containsKey(messageType);
    }

    /**
     * Returns the Integer of registered composers.
     *
     * @return The composer count
     */
    public int getComposerCount() {
        return composers.size();
    }
}
