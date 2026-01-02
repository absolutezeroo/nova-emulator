package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.PhoneCollectionStateMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes PhoneCollectionState packet for client.
 */
@ComposesPacket(Outgoing.PHONE_COLLECTION_STATE)
public class PhoneCollectionStateComposer extends PacketComposer<PhoneCollectionStateMessage> {
@Override
    protected void write(PacketBuffer packet, PhoneCollectionStateMessage message) {
        packet.appendInt(message.phoneStatusCode());
        packet.appendInt(message.collectionStatusCode());
        packet.appendInt(message.millisecondsToAllowProcessReset());
    }
}
