package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.MysteryBoxWaitingCanceledMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses MysteryBoxWaitingCanceled packet from client.
 */
@ParsesPacket(Incoming.MYSTERYBOXWAITINGCANCELEDMESSAGE)
public class MysteryBoxWaitingCanceledParser extends PacketParser<MysteryBoxWaitingCanceledMessageEvent> {
@Override
    public MysteryBoxWaitingCanceledMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new MysteryBoxWaitingCanceledMessageEvent();
    }
}
