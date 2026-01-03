package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.ShowEnforceRoomCategoryDialogMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes ShowEnforceRoomCategoryDialog packet for client.
 */
@ComposesPacket(Outgoing.SHOW_ENFORCE_ROOM_CATEGORY)
public class ShowEnforceRoomCategoryDialogComposer extends PacketComposer<ShowEnforceRoomCategoryDialogMessage> {
@Override
    protected void write(PacketBuffer packet, ShowEnforceRoomCategoryDialogMessage message) {
        packet.appendInt(message.selectionType());
    }
}
