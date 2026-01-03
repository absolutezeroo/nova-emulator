package com.nova.infra.adapter.network.packets.composers.user;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.user.PerkAllowancesMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes PerkAllowances packet for client.
 */
@ComposesPacket(Outgoing.USER_PERKS)
public class PerkAllowancesComposer extends PacketComposer<PerkAllowancesMessage> {
@Override
    protected void write(PacketBuffer packet, PerkAllowancesMessage message) {
        // No fields to write
    }
}
