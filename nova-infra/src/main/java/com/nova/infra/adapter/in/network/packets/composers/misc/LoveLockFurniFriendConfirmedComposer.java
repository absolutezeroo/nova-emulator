package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.LoveLockFurniFriendConfirmedMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes LoveLockFurniFriendConfirmed packet for client.
 */
@ComposesPacket(Outgoing.LOVELOCK_FURNI_FRIEND_COMFIRMED)
public class LoveLockFurniFriendConfirmedComposer extends PacketComposer<LoveLockFurniFriendConfirmedMessage> {
@Override
    protected void write(PacketBuffer packet, LoveLockFurniFriendConfirmedMessage message) {
        // No fields to write
    }
}
