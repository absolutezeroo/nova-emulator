package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.MoodlightTogggleStateMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses MoodlightTogggleState packet from client.
 */
@ParsesPacket(Incoming.ITEM_DIMMER_TOGGLE)
public class MoodlightTogggleStateParser extends PacketParser<MoodlightTogggleStateMessageEvent> {
@Override
    public MoodlightTogggleStateMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new MoodlightTogggleStateMessageEvent();
    }
}
