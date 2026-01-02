package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.IdentityAccountsMessage;

/**
 * Composes IdentityAccounts packet for client.
 */
public class IdentityAccountsComposer extends PacketComposer<IdentityAccountsMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.HANDSHAKE_IDENTITY_ACCOUNT;
    }

    @Override
    protected void write(PacketBuffer packet, IdentityAccountsMessage message) {
        // No fields to write
    }
}
