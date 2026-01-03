package com.nova.infra.adapter.persistence.entity.config;

/**
 * Database entity record mapping to the 'emulator_texts' table.
 * <p>
 * Server text/localization strings.
 */
public record EmulatorTextEntity(
        String key,
        String value
) {}
