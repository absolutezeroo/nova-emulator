package com.nova.infra.adapter.in.network.packets.outgoing.users;

import com.nova.infra.adapter.in.network.packets.IOutgoingPacket;

/**
 * Message containing user profile information.
 * <p>
 * Sent to client as packet ID 2725 (USER_OBJECT).
 *
 * @param id                   user ID
 * @param username             username
 * @param figure               avatar look string
 * @param gender               M or F
 * @param motto                user motto
 * @param realName             real name (usually same as username)
 * @param directMail           direct mail enabled
 * @param respectsReceived     total respects received
 * @param respectsRemaining    respects available to give today
 * @param respectsPetRemaining pet respects available today
 * @param streamPublishing     friend stream enabled
 * @param lastAccessDate       last online date
 * @param canChangeName        name change allowed
 * @param safetyLocked         safety lock enabled
 */
public record UserInfoMessage(
        int id,
        String username,
        String figure,
        String gender,
        String motto,
        String realName,
        boolean directMail,
        int respectsReceived,
        int respectsRemaining,
        int respectsPetRemaining,
        boolean streamPublishing,
        String lastAccessDate,
        boolean canChangeName,
        boolean safetyLocked
) implements IOutgoingPacket {
}
