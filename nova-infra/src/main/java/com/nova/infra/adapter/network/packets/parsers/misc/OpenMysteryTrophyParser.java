package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.OpenMysteryTrophyMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses OpenMysteryTrophy packet from client.
 */
@ParsesPacket(Incoming.MYSTERYBOX_OPEN_TROPHY)
public class OpenMysteryTrophyParser extends PacketParser<OpenMysteryTrophyMessageEvent> {
@Override
    public OpenMysteryTrophyMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new OpenMysteryTrophyMessageEvent();
    }
}
