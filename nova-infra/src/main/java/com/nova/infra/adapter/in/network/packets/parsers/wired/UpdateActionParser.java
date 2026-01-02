package com.nova.infra.adapter.in.network.packets.parsers.wired;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.wired.UpdateActionMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses UpdateAction packet from client.
 */
@ParsesPacket(Incoming.WIRED_ACTION_SAVE)
public class UpdateActionParser extends PacketParser<UpdateActionMessageEvent> {
@Override
    public UpdateActionMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new UpdateActionMessageEvent();
    }
}
