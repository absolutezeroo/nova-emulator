package com.nova.infra.adapter.in.network.packets.parsers.room;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.room.UpdateRoomCategoryAndTradeSettingsMessageEvent;

/**
 * Parses UpdateRoomCategoryAndTradeSettings packet from client.
 */
public class UpdateRoomCategoryAndTradeSettingsParser extends PacketParser<UpdateRoomCategoryAndTradeSettingsMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.ROOM_SETTINGS_UPDATE_ROOM_CATEGORY_AND_TRADE;
    }

    @Override
    public UpdateRoomCategoryAndTradeSettingsMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new UpdateRoomCategoryAndTradeSettingsMessageEvent();
    }
}
