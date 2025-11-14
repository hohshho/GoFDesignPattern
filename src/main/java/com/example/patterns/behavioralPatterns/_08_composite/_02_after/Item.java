package com.example.patterns.behavioralPatterns._08_composite._02_after;

import lombok.Getter;

@Getter
public class Item implements Component{
    int price;
    String name;

    Item(int price, String name) {
        this.price = price;
        this.name = name;
    }
}
