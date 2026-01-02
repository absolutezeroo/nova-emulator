package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.AddJukeboxDiskMessageEvent;

/**
 * Parses AddJukeboxDisk packet from client.
 */
public class AddJukeboxDiskParser extends PacketParser<AddJukeboxDiskMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.ADD_JUKEBOX_DISK;
    }

    @Override
    public AddJukeboxDiskMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new AddJukeboxDiskMessageEvent();
    }
}
