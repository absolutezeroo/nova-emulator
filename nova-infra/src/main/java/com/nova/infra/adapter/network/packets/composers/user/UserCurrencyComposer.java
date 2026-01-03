package com.nova.infra.adapter.network.packets.composers.user;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.user.UserCurrencyMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

import java.util.Map;

/**
 * Composes UserCurrency packet for client.
 * Sends activity points (pixels, diamonds, seasonal currencies).
 */
@ComposesPacket(Outgoing.USER_CURRENCY)
public class UserCurrencyComposer extends PacketComposer<UserCurrencyMessage> {

    @Override
    protected void write(PacketBuffer packet, UserCurrencyMessage message) {
        Map<Integer, Integer> points = message.activityPoints();
        packet.appendInt(points.size());

        for (Map.Entry<Integer, Integer> entry : points.entrySet()) {
            packet.appendInt(entry.getKey());   // Currency type (5=pixels, 101=diamonds, etc.)
            packet.appendInt(entry.getValue()); // Amount
        }
    }
}
