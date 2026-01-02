package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.SetPhoneNumberVerificationStatusMessageEvent;

/**
 * Parses SetPhoneNumberVerificationStatus packet from client.
 */
public class SetPhoneNumberVerificationStatusParser extends PacketParser<SetPhoneNumberVerificationStatusMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.SET_PHONE_NUMBER_VERIFICATION_STATUS;
    }

    @Override
    public SetPhoneNumberVerificationStatusMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new SetPhoneNumberVerificationStatusMessageEvent();
    }
}
