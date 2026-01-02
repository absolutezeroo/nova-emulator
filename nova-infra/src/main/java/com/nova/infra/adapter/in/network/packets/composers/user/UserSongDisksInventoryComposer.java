package com.nova.infra.adapter.in.network.packets.composers.user;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.user.UserSongDisksInventoryMessage;

/**
 * Composes UserSongDisksInventory packet for client.
 */
public class UserSongDisksInventoryComposer extends PacketComposer<UserSongDisksInventoryMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.USER_SONG_DISKS_INVENTORY;
    }

    @Override
    protected void write(PacketBuffer packet, UserSongDisksInventoryMessage message) {
        // No fields to write
    }
}
