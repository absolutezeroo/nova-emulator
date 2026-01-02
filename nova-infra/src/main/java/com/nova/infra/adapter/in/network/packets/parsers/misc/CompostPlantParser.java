package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.CompostPlantMessageEvent;

/**
 * Parses CompostPlant packet from client.
 */
public class CompostPlantParser extends PacketParser<CompostPlantMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.COMPOST_PLANT;
    }

    @Override
    public CompostPlantMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new CompostPlantMessageEvent();
    }
}
