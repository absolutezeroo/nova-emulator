package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.AddJukeboxDiskMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses AddJukeboxDisk packet from client.
 */
@ParsesPacket(Incoming.ADD_JUKEBOX_DISK)
public class AddJukeboxDiskParser extends PacketParser<AddJukeboxDiskMessageEvent> {
@Override
    public AddJukeboxDiskMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new AddJukeboxDiskMessageEvent();
    }
}
