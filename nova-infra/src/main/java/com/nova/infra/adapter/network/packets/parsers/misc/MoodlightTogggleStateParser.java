package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.MoodlightTogggleStateMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

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
