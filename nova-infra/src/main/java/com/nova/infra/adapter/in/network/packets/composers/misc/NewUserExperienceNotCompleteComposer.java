package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.NewUserExperienceNotCompleteMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

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
