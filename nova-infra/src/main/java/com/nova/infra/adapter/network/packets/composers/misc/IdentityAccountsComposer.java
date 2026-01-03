package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.IdentityAccountsMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes IdentityAccounts packet for client.
 */
@ComposesPacket(Outgoing.HANDSHAKE_IDENTITY_ACCOUNT)
public class IdentityAccountsComposer extends PacketComposer<IdentityAccountsMessage> {
@Override
    protected void write(PacketBuffer packet, IdentityAccountsMessage message) {
        // No fields to write
    }
}
