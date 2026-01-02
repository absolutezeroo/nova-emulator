package com.nova.infra.adapter.in.network.packets.composers.user;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.user.UserCurrencyMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes UserCurrency packet for client.
 */
@ComposesPacket(Outgoing.USER_CURRENCY)
public class UserCurrencyComposer extends PacketComposer<UserCurrencyMessage> {
@Override
    protected void write(PacketBuffer packet, UserCurrencyMessage message) {
        // No fields to write
    }
}
