package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.ResetPhoneNumberStateMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses ResetPhoneNumberState packet from client.
 */
@ParsesPacket(Incoming.RESET_PHONE_NUMBER_STATE)
public class ResetPhoneNumberStateParser extends PacketParser<ResetPhoneNumberStateMessageEvent> {
@Override
    public ResetPhoneNumberStateMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new ResetPhoneNumberStateMessageEvent();
    }
}
