package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.InterstitialMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes Interstitial packet for client.
 */
@ComposesPacket(Outgoing.INTERSTITIAL_MESSAGE)
public class InterstitialComposer extends PacketComposer<InterstitialMessage> {
@Override
    protected void write(PacketBuffer packet, InterstitialMessage message) {
        packet.appendBoolean(message.canShowInterstitial());
    }
}
