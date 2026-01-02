package com.nova.infra.adapter.in.network.packets.parsers.wired;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.wired.UpdateTriggerMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses UpdateTrigger packet from client.
 */
@ParsesPacket(Incoming.WIRED_TRIGGER_SAVE)
public class UpdateTriggerParser extends PacketParser<UpdateTriggerMessageEvent> {
@Override
    public UpdateTriggerMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new UpdateTriggerMessageEvent();
    }
}
