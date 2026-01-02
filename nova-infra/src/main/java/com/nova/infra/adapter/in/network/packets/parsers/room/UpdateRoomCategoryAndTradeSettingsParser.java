package com.nova.infra.adapter.in.network.packets.parsers.room;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.room.UpdateRoomCategoryAndTradeSettingsMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

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
