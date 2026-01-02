package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.CompostPlantMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses CompostPlant packet from client.
 */
@ParsesPacket(Incoming.COMPOST_PLANT)
public class CompostPlantParser extends PacketParser<CompostPlantMessageEvent> {
@Override
    public CompostPlantMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new CompostPlantMessageEvent();
    }
}
