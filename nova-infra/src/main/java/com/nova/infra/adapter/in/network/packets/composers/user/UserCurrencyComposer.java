package com.nova.infra.adapter.in.network.packets.composers.user;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.user.UserCurrencyMessage;

/**
 * Composes UserCurrency packet for client.
 */
public class UserCurrencyComposer extends PacketComposer<UserCurrencyMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.USER_CURRENCY;
    }

    @Override
    protected void write(PacketBuffer packet, UserCurrencyMessage message) {
        // No fields to write
    }
}
