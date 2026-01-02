package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetGiftWrappingConfigurationMessageEvent;

/**
 * Parses GetGiftWrappingConfiguration packet from client.
 */
public class GetGiftWrappingConfigurationParser extends PacketParser<GetGiftWrappingConfigurationMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GET_GIFT_WRAPPING_CONFIG;
    }

    @Override
    public GetGiftWrappingConfigurationMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetGiftWrappingConfigurationMessageEvent();
    }
}
