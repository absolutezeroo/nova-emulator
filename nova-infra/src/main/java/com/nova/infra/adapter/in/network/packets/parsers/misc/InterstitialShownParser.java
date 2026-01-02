package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.InterstitialShownMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses InterstitialShown packet from client.
 */
@ParsesPacket(Incoming.INTERSTITIAL_SHOWN)
public class InterstitialShownParser extends PacketParser<InterstitialShownMessageEvent> {
@Override
    public InterstitialShownMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new InterstitialShownMessageEvent();
    }
}
