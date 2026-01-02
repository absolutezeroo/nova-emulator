package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.RemoveJukeboxDiskMessageEvent;

/**
 * Parses RemoveJukeboxDisk packet from client.
 */
public class RemoveJukeboxDiskParser extends PacketParser<RemoveJukeboxDiskMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.REMOVE_JUKEBOX_DISK;
    }

    @Override
    public RemoveJukeboxDiskMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RemoveJukeboxDiskMessageEvent();
    }
}
