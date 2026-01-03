package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.NewUserExperienceNotCompleteMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes NewUserExperienceNotComplete packet for client.
 */
@ComposesPacket(Outgoing.NEW_USER_EXPERIENCE_NOT_COMPLETE)
public class NewUserExperienceNotCompleteComposer extends PacketComposer<NewUserExperienceNotCompleteMessage> {
@Override
    protected void write(PacketBuffer packet, NewUserExperienceNotCompleteMessage message) {
        // No fields to write
    }
}
