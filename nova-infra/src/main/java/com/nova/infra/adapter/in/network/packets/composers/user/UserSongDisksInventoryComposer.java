package com.nova.infra.adapter.in.network.packets.composers.user;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.user.UserSongDisksInventoryMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes UserSongDisksInventory packet for client.
 */
@ComposesPacket(Outgoing.USER_SONG_DISKS_INVENTORY)
public class UserSongDisksInventoryComposer extends PacketComposer<UserSongDisksInventoryMessage> {
@Override
    protected void write(PacketBuffer packet, UserSongDisksInventoryMessage message) {
        // No fields to write
    }
}
