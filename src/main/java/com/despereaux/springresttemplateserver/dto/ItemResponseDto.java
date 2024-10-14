package com.despereaux.springresttemplateserver.dto;

import lombok.Getter;

import java.util.List;

@Getter
public class ItemResponseDto {
    private final List<Item> items = new ArrayList<>();

    public void setItems(Item item) {
        items.add(item);
    }
}
