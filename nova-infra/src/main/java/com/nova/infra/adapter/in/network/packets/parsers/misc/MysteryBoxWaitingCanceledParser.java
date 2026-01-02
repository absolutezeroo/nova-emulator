package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.MysteryBoxWaitingCanceledMessageEvent;

/**
 * Parses MysteryBoxWaitingCanceled packet from client.
 */
public class MysteryBoxWaitingCanceledParser extends PacketParser<MysteryBoxWaitingCanceledMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.MYSTERYBOXWAITINGCANCELEDMESSAGE;
    }

    @Override
    public MysteryBoxWaitingCanceledMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new MysteryBoxWaitingCanceledMessageEvent();
    }
}
