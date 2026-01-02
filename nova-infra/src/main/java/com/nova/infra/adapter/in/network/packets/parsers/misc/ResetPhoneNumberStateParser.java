package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.ResetPhoneNumberStateMessageEvent;

/**
 * Parses ResetPhoneNumberState packet from client.
 */
public class ResetPhoneNumberStateParser extends PacketParser<ResetPhoneNumberStateMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.RESET_PHONE_NUMBER_STATE;
    }

    @Override
    public ResetPhoneNumberStateMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new ResetPhoneNumberStateMessageEvent();
    }
}
