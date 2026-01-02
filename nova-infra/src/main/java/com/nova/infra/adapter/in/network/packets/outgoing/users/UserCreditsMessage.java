package com.nova.infra.adapter.in.network.packets.outgoing.users;

import com.nova.infra.adapter.in.network.packets.IOutgoingPacket;

/**
 * Message containing user credits balance.
 * <p>
 * Sent to client as packet ID 3475 (USER_CREDITS).
 *
 * @param credits the user's credit balance as string
 */
public record UserCreditsMessage(String credits) implements IOutgoingPacket {

    /**
     * Creates a credits message from an integer value.
     */
    public static UserCreditsMessage of(int credits) {
        return new UserCreditsMessage(String.valueOf(credits));
    }
}
