package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.AccountSafetyLockStatusChangeMessage;

/**
 * Composes AccountSafetyLockStatusChange packet for client.
 */
public class AccountSafetyLockStatusChangeComposer extends PacketComposer<AccountSafetyLockStatusChangeMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.ACCOUNT_SAFETY_LOCK_STATUS_CHANGE;
    }

    @Override
    protected void write(PacketBuffer packet, AccountSafetyLockStatusChangeMessage message) {
        packet.appendInt(message.status());
    }
}
