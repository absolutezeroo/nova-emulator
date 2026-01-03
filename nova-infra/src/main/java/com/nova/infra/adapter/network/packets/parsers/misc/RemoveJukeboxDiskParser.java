package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.RemoveJukeboxDiskMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses RemoveJukeboxDisk packet from client.
 */
@ParsesPacket(Incoming.REMOVE_JUKEBOX_DISK)
public class RemoveJukeboxDiskParser extends PacketParser<RemoveJukeboxDiskMessageEvent> {
@Override
    public RemoveJukeboxDiskMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RemoveJukeboxDiskMessageEvent();
    }
}
