package com.nova.core.domain.model.social.group;

import java.util.Objects;

/**
 * Value Object representing a group's badge configuration.
 * <p>
 * Badge format: "b{base}{baseColor}s{symbol}{symbolColor}s{symbol2}{symbol2Color}..."
 */
public record GroupBadge(
        int base,
        int baseColor,
        int symbol1,
        int symbol1Color,
        int symbol1Position,
        int symbol2,
        int symbol2Color,
        int symbol2Position,
        int symbol3,
        int symbol3Color,
        int symbol3Position,
        int symbol4,
        int symbol4Color,
        int symbol4Position
) {
    public static GroupBadge defaultBadge() {
        return new GroupBadge(1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
    }

    /**
     * Generate the badge code string.
     */
    public String toCode() {
        StringBuilder sb = new StringBuilder();
        sb.append("b").append(String.format("%02d", base)).append(String.format("%02d", baseColor));

        if (symbol1 > 0) {
            sb.append("s").append(String.format("%02d", symbol1))
              .append(String.format("%02d", symbol1Color))
              .append(symbol1Position);
        }
        if (symbol2 > 0) {
            sb.append("s").append(String.format("%02d", symbol2))
              .append(String.format("%02d", symbol2Color))
              .append(symbol2Position);
        }
        if (symbol3 > 0) {
            sb.append("s").append(String.format("%02d", symbol3))
              .append(String.format("%02d", symbol3Color))
              .append(symbol3Position);
        }
        if (symbol4 > 0) {
            sb.append("s").append(String.format("%02d", symbol4))
              .append(String.format("%02d", symbol4Color))
              .append(symbol4Position);
        }

        return sb.toString();
    }
}
