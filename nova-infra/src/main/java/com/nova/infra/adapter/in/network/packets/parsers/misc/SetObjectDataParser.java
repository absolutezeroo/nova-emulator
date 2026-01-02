package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.SetObjectDataMessageEvent;

/**
 * Parses SetObjectData packet from client.
 */
public class SetObjectDataParser extends PacketParser<SetObjectDataMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.SET_OBJECT_DATA;
    }

    @Override
    public SetObjectDataMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new SetObjectDataMessageEvent();
    }
}
