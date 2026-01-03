package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.MysteryBoxWaitingCanceledMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

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
