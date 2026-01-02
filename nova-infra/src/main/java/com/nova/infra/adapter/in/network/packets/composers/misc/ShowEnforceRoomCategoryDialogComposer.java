package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.ShowEnforceRoomCategoryDialogMessage;

/**
 * Composes ShowEnforceRoomCategoryDialog packet for client.
 */
public class ShowEnforceRoomCategoryDialogComposer extends PacketComposer<ShowEnforceRoomCategoryDialogMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.SHOW_ENFORCE_ROOM_CATEGORY;
    }

    @Override
    protected void write(PacketBuffer packet, ShowEnforceRoomCategoryDialogMessage message) {
        packet.appendInt(message.selectionType());
    }
}
