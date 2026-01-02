package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.TryPhoneNumberMessageEvent;

/**
 * Parses TryPhoneNumber packet from client.
 */
public class TryPhoneNumberParser extends PacketParser<TryPhoneNumberMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.TRY_PHONE_NUMBER;
    }

    @Override
    public TryPhoneNumberMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new TryPhoneNumberMessageEvent();
    }
}
