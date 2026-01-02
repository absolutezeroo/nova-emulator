package com.nova.infra.adapter.in.network.packets.composers.user;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.user.PerkAllowancesMessage;

/**
 * Composes PerkAllowances packet for client.
 */
public class PerkAllowancesComposer extends PacketComposer<PerkAllowancesMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.USER_PERKS;
    }

    @Override
    protected void write(PacketBuffer packet, PerkAllowancesMessage message) {
        // No fields to write
    }
}
