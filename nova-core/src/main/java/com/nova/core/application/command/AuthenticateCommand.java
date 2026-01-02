package com.nova.core.application.command;

/**
 * Command DTO for user authentication via SSO ticket.
 * <p>
 * This record encapsulates the authentication request data,
 * following the Command Pattern for clean separation between
 * infrastructure (network packets) and domain logic.
 *
 * @param ssoTicket the Single Sign-On ticket from the client
 */
public record AuthenticateCommand(String ssoTicket) {

    public AuthenticateCommand {
        if (ssoTicket == null || ssoTicket.isBlank()) {
            throw new IllegalArgumentException("SSO ticket cannot be null or blank");
        }
    }
}
