package com.nova.infra.adapter.in.network.packets.parsers.wired;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.wired.UpdateConditionMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses UpdateCondition packet from client.
 */
@ParsesPacket(Incoming.WIRED_CONDITION_SAVE)
public class UpdateConditionParser extends PacketParser<UpdateConditionMessageEvent> {
@Override
    public UpdateConditionMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new UpdateConditionMessageEvent();
    }
}
