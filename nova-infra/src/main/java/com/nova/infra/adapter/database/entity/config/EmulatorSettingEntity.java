package com.nova.infra.adapter.database.entity.config;

/**
 * Database entity record mapping to the 'emulator_settings' table.
 * <p>
 * Server configuration settings.
 */
public record EmulatorSettingEntity(
        String key,
        String value,
        String description
) {}
