package com.nova.core.domain.model.core.user;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Value Object representing user currencies.
 * <p>
 * Corresponds to 'user_currencies' table.
 * Supports multiple currency types.
 */
public record UserCurrencies(
        int credits,
        int pixels,
        int diamonds,
        Map<Integer, Integer> otherCurrencies
) {
    public static final int TYPE_CREDITS = 0;
    public static final int TYPE_PIXELS = 5;
    public static final int TYPE_DIAMONDS = 101;
    public static final int TYPE_SEASONAL = 102;

    public UserCurrencies {
        otherCurrencies = otherCurrencies != null ? Map.copyOf(otherCurrencies) : Collections.emptyMap();
    }

    public static UserCurrencies empty() {
        return new UserCurrencies(0, 0, 0, Collections.emptyMap());
    }

    public static UserCurrencies of(int credits, int pixels, int diamonds) {
        return new UserCurrencies(credits, pixels, diamonds, Collections.emptyMap());
    }

    public int getCurrency(int type) {
        return switch (type) {
            case TYPE_CREDITS -> credits;
            case TYPE_PIXELS -> pixels;
            case TYPE_DIAMONDS -> diamonds;
            default -> otherCurrencies.getOrDefault(type, 0);
        };
    }

    public UserCurrencies withCredits(int newCredits) {
        return new UserCurrencies(newCredits, pixels, diamonds, otherCurrencies);
    }

    public UserCurrencies withPixels(int newPixels) {
        return new UserCurrencies(credits, newPixels, diamonds, otherCurrencies);
    }

    public UserCurrencies withDiamonds(int newDiamonds) {
        return new UserCurrencies(credits, pixels, newDiamonds, otherCurrencies);
    }

    public UserCurrencies addCredits(int amount) {
        if (amount < 0) throw new IllegalArgumentException("Cannot add negative credits");

        return withCredits(credits + amount);
    }

    public UserCurrencies addPixels(int amount) {
        if (amount < 0) throw new IllegalArgumentException("Cannot add negative pixels");

        return withPixels(pixels + amount);
    }

    public UserCurrencies addDiamonds(int amount) {
        if (amount < 0) throw new IllegalArgumentException("Cannot add negative diamonds");

        return withDiamonds(diamonds + amount);
    }

    public boolean canAffordCredits(int amount) {
        return credits >= amount;
    }

    public boolean canAffordPixels(int amount) {
        return pixels >= amount;
    }

    public boolean canAffordDiamonds(int amount) {
        return diamonds >= amount;
    }

    public UserCurrencies spendCredits(int amount) {
        if (amount < 0) throw new IllegalArgumentException("Cannot spend negative credits");

        if (credits < amount) throw new IllegalArgumentException("Insufficient credits");

        return withCredits(credits - amount);
    }

    public UserCurrencies spendPixels(int amount) {
        if (amount < 0) throw new IllegalArgumentException("Cannot spend negative pixels");

        if (pixels < amount) throw new IllegalArgumentException("Insufficient pixels");

        return withPixels(pixels - amount);
    }

    public UserCurrencies spendDiamonds(int amount) {
        if (amount < 0) throw new IllegalArgumentException("Cannot spend negative diamonds");

        if (diamonds < amount) throw new IllegalArgumentException("Insufficient diamonds");

        return withDiamonds(diamonds - amount);
    }

    /**
     * Gets a map of all activity point currencies (pixels, diamonds, seasonal).
     * Used for sending UserCurrencyMessage to client.
     */
    public Map<Integer, Integer> getActivityPoints() {
        Map<Integer, Integer> points = new HashMap<>();

        points.put(TYPE_PIXELS, pixels);
        points.put(TYPE_DIAMONDS, diamonds);
        points.putAll(otherCurrencies);

        return Collections.unmodifiableMap(points);
    }
}
