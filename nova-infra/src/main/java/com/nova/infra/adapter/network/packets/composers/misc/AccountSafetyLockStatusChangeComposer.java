package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.AccountSafetyLockStatusChangeMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes AccountSafetyLockStatusChange packet for client.
 */
@ComposesPacket(Outgoing.ACCOUNT_SAFETY_LOCK_STATUS_CHANGE)
public class AccountSafetyLockStatusChangeComposer extends PacketComposer<AccountSafetyLockStatusChangeMessage> {
@Override
    protected void write(PacketBuffer packet, AccountSafetyLockStatusChangeMessage message) {
        packet.appendInt(message.status());
    }
}
