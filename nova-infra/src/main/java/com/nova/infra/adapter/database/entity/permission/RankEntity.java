package com.nova.infra.adapter.database.entity.permission;

import java.time.Instant;

/**
 * Database entity record mapping to the 'ranks' table.
 */
public record RankEntity(
        int id,
        String name,
        String badge,
        int level,
        String prefix,
        String prefixColor,
        boolean isHidden,
        Instant createdAt
) {}
