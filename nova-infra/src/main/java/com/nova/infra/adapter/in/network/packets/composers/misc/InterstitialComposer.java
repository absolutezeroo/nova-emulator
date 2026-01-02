package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.InterstitialMessage;

/**
 * Composes Interstitial packet for client.
 */
public class InterstitialComposer extends PacketComposer<InterstitialMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.INTERSTITIAL_MESSAGE;
    }

    @Override
    protected void write(PacketBuffer packet, InterstitialMessage message) {
        packet.appendBoolean(message.canShowInterstitial());
    }
}
