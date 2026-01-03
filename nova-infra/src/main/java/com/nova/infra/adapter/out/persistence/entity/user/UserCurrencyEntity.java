package com.nova.infra.adapter.out.persistence.entity.user;

/**
 * Database entity record mapping to the 'user_currencies' table.
 * <p>
 * Flexible multi-currency system.
 * Currency types: 0=credits, 5=pixels, 101=diamonds, 102=seasonal
 */
public record UserCurrencyEntity(
        int userId,
        int currencyType,
        int amount
) {
    // Currency type constants
    public static final int CREDITS = 0;
    public static final int PIXELS = 5;
    public static final int DIAMONDS = 101;
    public static final int SEASONAL = 102;
}
