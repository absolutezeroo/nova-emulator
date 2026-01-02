package com.nova.infra.adapter.in.network.packets.composers.messenger;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.messenger.HabboSearchResultMessage;

/**
 * Composes HabboSearchResult packet for client.
 */
public class HabboSearchResultComposer extends PacketComposer<HabboSearchResultMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.MESSENGER_SEARCH;
    }

    @Override
    protected void write(PacketBuffer packet, HabboSearchResultMessage message) {
        // No fields to write
    }
}
