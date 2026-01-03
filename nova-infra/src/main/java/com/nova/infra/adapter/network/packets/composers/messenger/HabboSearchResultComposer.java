package com.nova.infra.adapter.network.packets.composers.messenger;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.messenger.HabboSearchResultMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes HabboSearchResult packet for client.
 */
@ComposesPacket(Outgoing.MESSENGER_SEARCH)
public class HabboSearchResultComposer extends PacketComposer<HabboSearchResultMessage> {
@Override
    protected void write(PacketBuffer packet, HabboSearchResultMessage message) {
        // No fields to write
    }
}
