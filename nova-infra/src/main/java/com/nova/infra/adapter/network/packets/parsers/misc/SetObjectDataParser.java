package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.SetObjectDataMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses SetObjectData packet from client.
 */
@ParsesPacket(Incoming.SET_OBJECT_DATA)
public class SetObjectDataParser extends PacketParser<SetObjectDataMessageEvent> {
@Override
    public SetObjectDataMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new SetObjectDataMessageEvent();
    }
}
