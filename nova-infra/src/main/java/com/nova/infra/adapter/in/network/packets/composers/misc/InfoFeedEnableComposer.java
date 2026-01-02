package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.InfoFeedEnableMessage;

/**
 * Composes InfoFeedEnable packet for client.
 */
public class InfoFeedEnableComposer extends PacketComposer<InfoFeedEnableMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.INFO_FEED_ENABLE;
    }

    @Override
    protected void write(PacketBuffer packet, InfoFeedEnableMessage message) {
        packet.appendBoolean(message.enabled());
    }
}
