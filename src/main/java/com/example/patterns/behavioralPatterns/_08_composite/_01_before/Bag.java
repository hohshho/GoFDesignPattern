package com.example.patterns.behavioralPatterns._08_composite._01_before;

import lombok.Getter;

import java.util.List;

@Getter
public class Bag {
    private List<Item> items;

    public void add(Item item) {
        items.add(item);
    }
}
