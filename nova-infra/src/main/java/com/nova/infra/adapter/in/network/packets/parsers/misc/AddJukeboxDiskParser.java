package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.AddJukeboxDiskMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

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
