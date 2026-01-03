package com.nova.infra.adapter.network.packets.outgoing.user;

import com.nova.infra.adapter.network.packets.OutgoingPacket;

import java.util.Map;

/**
 * Message sent to client with activity points (pixels, diamonds, seasonal, etc.)
 * Uses USER_CURRENCY header (2018).
 */
public record UserCurrencyMessage(
    Map<Integer, Integer> activityPoints
) implements OutgoingPacket {

    public static UserCurrencyMessage of(int pixels, int diamonds) {
        return new UserCurrencyMessage(Map.of(5, pixels, 101, diamonds));
    }

    public static UserCurrencyMessage of(Map<Integer, Integer> points) {
        return new UserCurrencyMessage(points);
    }
}
