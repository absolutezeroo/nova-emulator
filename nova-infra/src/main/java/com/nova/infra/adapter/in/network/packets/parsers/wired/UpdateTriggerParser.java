package com.nova.infra.adapter.in.network.packets.parsers.wired;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.wired.UpdateTriggerMessageEvent;

/**
 * Parses UpdateTrigger packet from client.
 */
public class UpdateTriggerParser extends PacketParser<UpdateTriggerMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.WIRED_TRIGGER_SAVE;
    }

    @Override
    public UpdateTriggerMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new UpdateTriggerMessageEvent();
    }
}
