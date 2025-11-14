package com.example.patterns.behavioralPatterns._08_composite._02_after;


import lombok.Getter;

import java.util.List;

@Getter
public class Bag implements Component{
    private List<Item> items;

    public void add(Item item) {
        items.add(item);
    }

    @Override
    public int getPrice() {
        return items.stream().mapToInt(Item::getPrice).sum();
    }
}
