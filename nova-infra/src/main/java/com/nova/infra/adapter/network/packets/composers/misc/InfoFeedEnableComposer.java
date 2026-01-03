package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.InfoFeedEnableMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes InfoFeedEnable packet for client.
 */
@ComposesPacket(Outgoing.INFO_FEED_ENABLE)
public class InfoFeedEnableComposer extends PacketComposer<InfoFeedEnableMessage> {
@Override
    protected void write(PacketBuffer packet, InfoFeedEnableMessage message) {
        packet.appendBoolean(message.enabled());
    }
}
