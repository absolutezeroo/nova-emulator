package com.nova.infra.adapter.in.network.packets;

import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;

/**
 * Interface for objects that can compose themselves into a packet buffer.
 * <p>
 * Used for nested or complex data structures that need to serialize
 * themselves as part of a larger packet (e.g., Room data, User data).
 * <p>
 * This allows for clean composition of complex packet structures
 * without the composer needing to know internal details.
 */
public interface Composable {

    /**
     * Composes this object's data into the provided packet buffer.
     *
     * @param packet the packet buffer to write data to
     */
    void compose(PacketBuffer packet);
}
