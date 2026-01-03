package com.nova.core.domain.model.hotel.unit;

/**
 * Constants for room unit status keys.
 * <p>
 * Status is sent to client as key-value pairs.
 * Example: "mv 5,3,2.0" (moving to position)
 */
public final class RoomUnitStatus {
    private RoomUnitStatus() {}

    /** Moving to position: "mv x,y,height" */
    public static final String MOVE = "mv";

    /** Sitting: "sit height" */
    public static final String SIT = "sit";

    /** Laying down: "lay height" */
    public static final String LAY = "lay";

    /** Flat control (admin mode): "flatctrl level" */
    public static final String FLAT_CONTROL = "flatctrl";

    /** Sign: "sign number" (0-17) */
    public static final String SIGN = "sign";

    /** Gesture/expression: "gst gesture" (sml=smile, sad, agr=angry, srp=surprised, spk=speaking) */
    public static final String GESTURE = "gst";

    /** Wave: "wav" */
    public static final String WAVE = "wav";

    /** Dance: "dance style" (1-4) */
    public static final String DANCE = "dance";

    /** Carry item: "cri itemId" */
    public static final String CARRY_ITEM = "cri";

    /** Use item: "usei itemId" */
    public static final String USE_ITEM = "usei";

    /** Effect: "eff effectId" */
    public static final String EFFECT = "eff";
}
