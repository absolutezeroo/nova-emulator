package com.nova.infra.adapter.in.network.packets.parsers.wired;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.wired.ApplySnapshotMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses ApplySnapshot packet from client.
 */
@ParsesPacket(Incoming.WIRED_APPLY_SNAPSHOT)
public class ApplySnapshotParser extends PacketParser<ApplySnapshotMessageEvent> {
@Override
    public ApplySnapshotMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new ApplySnapshotMessageEvent();
    }
}
