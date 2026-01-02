package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.IsBadgeRequestFulfilledMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes IsBadgeRequestFulfilled packet for client.
 */
@ComposesPacket(Outgoing.BADGE_REQUEST_FULFILLED)
public class IsBadgeRequestFulfilledComposer extends PacketComposer<IsBadgeRequestFulfilledMessage> {
@Override
    protected void write(PacketBuffer packet, IsBadgeRequestFulfilledMessage message) {
        packet.appendString(message.requestCode());
        packet.appendBoolean(message.fulfilled());
    }
}
