package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetInterstitialMessageEvent;

/**
 * Parses GetInterstitial packet from client.
 */
public class GetInterstitialParser extends PacketParser<GetInterstitialMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GET_INTERSTITIAL;
    }

    @Override
    public GetInterstitialMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetInterstitialMessageEvent();
    }
}
