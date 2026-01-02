package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.IsBadgeRequestFulfilledMessage;

/**
 * Composes IsBadgeRequestFulfilled packet for client.
 */
public class IsBadgeRequestFulfilledComposer extends PacketComposer<IsBadgeRequestFulfilledMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.BADGE_REQUEST_FULFILLED;
    }

    @Override
    protected void write(PacketBuffer packet, IsBadgeRequestFulfilledMessage message) {
        packet.appendString(message.requestCode());
        packet.appendBoolean(message.fulfilled());
    }
}
