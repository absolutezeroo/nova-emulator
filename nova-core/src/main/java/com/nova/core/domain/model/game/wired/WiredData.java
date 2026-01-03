package com.nova.core.domain.model.game.wired;

import com.nova.core.domain.model.hotel.item.ItemId;

import java.util.*;

/**
 * Value Object representing Wired configuration data.
 */
public record WiredData(
        int delay,
        String stringParam,
        List<Integer> intParams,
        List<ItemId> selectedItems,
        String extraData
) {
    public WiredData {
        stringParam = stringParam != null ? stringParam : "";
        intParams = intParams != null ? List.copyOf(intParams) : List.of();
        selectedItems = selectedItems != null ? List.copyOf(selectedItems) : List.of();
        extraData = extraData != null ? extraData : "";
    }

    public static WiredData empty() {
        return new WiredData(0, "", List.of(), List.of(), "");
    }

    public static WiredData ofDelay(int delay) {
        return new WiredData(delay, "", List.of(), List.of(), "");
    }

    public static WiredData ofMessage(String message) {
        return new WiredData(0, message, List.of(), List.of(), "");
    }

    public WiredData withDelay(int newDelay) {
        return new WiredData(newDelay, stringParam, intParams, selectedItems, extraData);
    }

    public WiredData withStringParam(String newString) {
        return new WiredData(delay, newString, intParams, selectedItems, extraData);
    }

    public WiredData withIntParams(List<Integer> newIntParams) {
        return new WiredData(delay, stringParam, newIntParams, selectedItems, extraData);
    }

    public WiredData withSelectedItems(List<ItemId> newItems) {
        return new WiredData(delay, stringParam, intParams, newItems, extraData);
    }

    public int getIntParam(int index) {
        return index >= 0 && index < intParams.size() ? intParams.get(index) : 0;
    }

    public boolean hasSelectedItems() {
        return !selectedItems.isEmpty();
    }
}
