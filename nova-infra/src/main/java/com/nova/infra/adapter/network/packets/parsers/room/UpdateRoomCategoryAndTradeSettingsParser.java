package com.nova.infra.adapter.network.packets.parsers.room;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.room.UpdateRoomCategoryAndTradeSettingsMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses UpdateRoomCategoryAndTradeSettings packet from client.
 */
@ParsesPacket(Incoming.ROOM_SETTINGS_UPDATE_ROOM_CATEGORY_AND_TRADE)
public class UpdateRoomCategoryAndTradeSettingsParser extends PacketParser<UpdateRoomCategoryAndTradeSettingsMessageEvent> {
@Override
    public UpdateRoomCategoryAndTradeSettingsMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new UpdateRoomCategoryAndTradeSettingsMessageEvent();
    }
}
